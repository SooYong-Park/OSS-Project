import java.net.URLEncoder;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test{
	public static void main(String[] args) {
		String[] arr = new String[10];
		try {
			//while(true) {
				/*String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
						+ "xml/Grid_20150827000000000226_1/1/6" + "?" + URLEncoder.encode("RECIPE_NM_KO","UTF-8") + "=" + URLEncoder.encode("김치찌개", "UTF-8");*/
				String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
						+ "xml/Grid_20150827000000000227_1/1/6" + "?" + URLEncoder.encode("IRDNT_NM","UTF-8") + "=" + URLEncoder.encode("배추김치", "UTF-8");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(url);
                doc.getDocumentElement().normalize();
                System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
                
                NodeList nList = doc.getElementsByTagName("row");
                System.out.println("파싱할 리스트 수 : " + nList.getLength());
                
                for(int temp = 0; temp < nList.getLength(); temp++) {
                	Node nNode = nList.item(temp);
                	if(nNode.getNodeType() == Node.ELEMENT_NODE){
						
                		Element eElement = (Element) nNode;
                		System.out.println("######################");
                		//System.out.println(eElement.getTextContent());
                		System.out.println("래시피 코드  : " + getTagValue("RECIPE_ID", eElement));
                		System.out.println("재료 명  : " + getTagValue("IRDNT_NM", eElement));
                		System.out.println("재료 중요도 : " + getTagValue("IRDNT_TY_NM", eElement));
                		//System.out.println("국가 정보  : " + getTagValue("NATION_NM", eElement));
                		//System.out.println("칼로리  : " + getTagValue("CALORIE", eElement));
                		String rCode = getTagValue("RECIPE_ID", eElement);
                		System.out.println("음식 코드 : " + rCode);
                		arr[temp] = rCode;
                	
                }
                }
                for(int i = 0 ; i<arr.length; i ++) {
                	System.out.println(arr[i]);
                }
			//}
		}catch(Exception e){
			
		}
		
	}

	private static String getTagValue(String tag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		
		Node nValue = (Node) nlList.item(0);
		if(nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}
}
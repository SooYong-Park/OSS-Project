import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;

import java.io.*;

/*class testFrame extends JFrame{
	testFrame(){
		setTitle("테스트");
		setSize(300,300);
		setVisible(true);
	}
}*/

public class Test{
	static List<String> Array = new ArrayList<String>();
	static ArrayList<rcpInfo> rcpList = new ArrayList<>();
	static String filePath = "./inputIrdnt.txt";
	static String filePath1 = "./rcpInfo.txt";
	static BufferedWriter bw = null;
	static BufferedReader br = null;
	public static void main(String[] args) {
		rcpInfoReader();	//레시피 기본정보 txt에 담는 메소드 호출
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력할 재료 수 입력(최대 3개까지 입력 가능) : ");
			int count = sc.nextInt();
			FileOutputStream output = new FileOutputStream(filePath, false);
			OutputStreamWriter writer=new OutputStreamWriter(output, Charset.forName("EUC-KR"));
			sc.nextLine();
			for(int j = 0; j < count; j ++) {
				bw = new BufferedWriter(writer);
				System.out.print("재료 입력 : ");
				String igdet = sc.nextLine();
				String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
						+ "xml/Grid_20150827000000000227_1/1/200" + "?" + URLEncoder.encode("IRDNT_NM","UTF-8") + "=" + URLEncoder.encode(igdet, "UTF-8");
				
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(url);
                doc.getDocumentElement().normalize();
                System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
                
                NodeList nList = doc.getElementsByTagName("row");
                System.out.println("파싱할 리스트 수 : " + nList.getLength());
                
                for(int temp = 0; temp < nList.getLength(); temp++) {	//리스트의 개수만큼 데이터를 끌어와서 Array라는 배열에 저장
                	Node nNode = nList.item(temp);
                	if(nNode.getNodeType() == Node.ELEMENT_NODE){
						
                		Element eElement = (Element) nNode;
                		System.out.println("######################");
                		System.out.println("레시피 코드  : " + getTagValue("RECIPE_ID", eElement));
                		String rCode = getTagValue("RECIPE_ID", eElement);
                		Array.add(rCode);
                		bw.write(igdet + "//" + rCode);
                		bw.write("\n");
                	}	//if문
                }	//for문
                for(int q = 0 ; q<Array.size(); q ++) {	//그냥 배열에 잘 들어가있나 확인해본거!
                	System.out.println("배열에 있는 레시피 코드 : " + Array.get(q));
                }	//for문
                bw.flush();
                bw.close();
                String line;
                br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath1), "EUC-KR"));
    			while((line = br.readLine()) != null) {	//rcpInfoReader로 읽어서 txt파일에 저장해 놓은것들을 읽어들여서 배열에 저장해
    				rcpInfo ri = new rcpInfo();
    				StringTokenizer st = new StringTokenizer(line,"//");
    				ri.rCode = st.nextToken();
    				ri.rName = st.nextToken();
    				ri.rLevel = st.nextToken();
    				rcpList.add(ri);
    			}	//while문
    			br.close();
    			for(int i = 0 ; i<rcpList.size(); i++) {	//배열에 저장해놓은 기본정보 중에서 입력한 재료 레시피 코드랑 겹치는 기본정보 출력
    				rcpInfo ri = rcpList.get(i);
    				String t = ri.rName;
    				String p = ri.rLevel;
    				for(int k = 0 ; k<Array.size(); k++) {
    					if(ri.rCode.equals(Array.get(k))) {
        					System.out.println("레시피 이름 : " + t + " 난이도 : " + p);
        				}	//if문
    				}	//안쪽 for문
    			}	//바깥 for문
			}	//엄청 큰 for문
		}catch(Exception e){
			System.out.println("오류");
			System.out.println(e);
		}	//예외처리
	}	//main 메소드

	private static String getTagValue(String tag, Element eElement) {	//api에서 데이터 파싱하는 메소드(건들 필요 없을거얌)
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		
		Node nValue = (Node) nlList.item(0);
		if(nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}
	
	public static void rcpInfoReader() {	//레시피 기본정보 가지고오는 메소드(이거도 건들 필요 없을거얌)
		try {
			FileOutputStream output1=new FileOutputStream(filePath1, false);
			OutputStreamWriter writer1=new OutputStreamWriter(output1, Charset.forName("EUC-KR"));
			bw = new BufferedWriter(writer1);
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000226_1/1/1000";
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
            Document doc1 = dBuilder1.parse(url1);
            doc1.getDocumentElement().normalize();
            System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());
            
            NodeList nList1 = doc1.getElementsByTagName("row");
            System.out.println("파싱할 리스트 수 : " + nList1.getLength());
			
			for(int temp = 0; temp < nList1.getLength(); temp++) {
            	Node nNode = nList1.item(temp);
            	if(nNode.getNodeType() == Node.ELEMENT_NODE){
					
            		Element eElement = (Element) nNode;
            		//System.out.println("######################");
            		//System.out.println(eElement.getTextContent());
            		//System.out.println("레시피 코드  : " + getTagValue("RECIPE_ID", eElement));
            		//System.out.println("레시피 이름  : " + getTagValue("RECIPE_NM_KO", eElement));
            		//System.out.println("간략 소개 : " + getTagValue("SUMRY", eElement));
            		//System.out.println("국가 정보  : " + getTagValue("NATION_NM", eElement));
            		//System.out.println("칼로리  : " + getTagValue("CALORIE", eElement));
            		String rCode = getTagValue("RECIPE_ID", eElement);
            		String rName = getTagValue("RECIPE_NM_KO", eElement);
            		//String rSumry = getTagValue("SUMRY", eElement);
            		String rLevel = getTagValue("LEVEL_NM", eElement);
            		//System.out.println("음식 코드 : " + rCode);
            		//Array.add(rCode);
            		bw.write(rCode + "//" + rName + "//" + rLevel);
            		bw.write("\n");
            	}
            }
			bw.flush();
            bw.close();
		}catch(Exception e) {
			System.out.println("rcpInfoReader 오류");
		}
	}
	
	
}
class rcpInfo {	//레시피 기본정보 데이터를 필드로 가지는 클래스
	String rCode = null;
	String rName = null;
	String rLevel = null;
}
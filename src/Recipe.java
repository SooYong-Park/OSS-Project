import java.net.URLEncoder;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Recipe {
	static String rCodeList[] = new String[500000];
	static String rNameList[] = new String[500000];
	static String rSumryList[] = new String[500000];
	static String rLevelList[] = new String[500000];
	static String cigdetPath = "./createigdet.txt";
	static String cInfoPath = "./create.txt";
	static String crcpPath = "./creatercpdc.txt";
	static List<Integer> Array = new ArrayList<Integer>();
	static List<String> createIgdet = new ArrayList<String>();
	static List<String> createIgdetrCode = new ArrayList<String>();
	static List<String> createIgdetCpcty = new ArrayList<String>();
	static List<String> createRcpDcrCode = new ArrayList<String>();
	static List<String> createRcpDcNo = new ArrayList<String>();
	static List<String> createRcpDc = new ArrayList<String>();

	static String rNameList2[] = new String[1000];
	static String rLevelList2[] = new String[1000];
	static String rSumryList2[] = new String[1000];
	static String rNameList3[] = new String[1000];
	static String rLevelList3[] = new String[1000];
	static String rSumryList3[] = new String[1000];
	static String rNameList4[] = new String[1000];
	static String rLevelList4[] = new String[1000];
	static String rSumryList4[] = new String[1000];

	static int q = 0;

	public static void R(int cn, String[] sn) {
		rcpInfoReader(); // 레시피 기본정보 txt에 담는 메소드 호출
		int count = cn;
		String[] igdet = new String[5];
		for (int i = 0; i < count; i++) {
			igdet[i] = sn[i];
		}

		for (int j = 0; j < count; j++) { // 재료입력 count만큼 메소드 실행

			inputIgdet(igdet[j]);

		}
		Algorithm a = new Algorithm();
		a.Algorithm(Array);
	}

	public static void inputIgdet(String igdet) {
		try {

			String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000227_1/1/200" + "?" + URLEncoder.encode("IRDNT_NM", "UTF-8") + "="
					+ URLEncoder.encode(igdet, "UTF-8");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("row");
			for (int temp = 0; temp < nList.getLength(); temp++) { // 리스트의 개수만큼 데이터를 끌어와서 Array라는 배열에 저장
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String rCode = getTagValue("RECIPE_ID", eElement);
					int int_val = Integer.parseInt(rCode);
					Array.add(int_val);

				}
			}
			String s; // txt파일 배열에 입력
			BufferedReader bos = new BufferedReader(new FileReader(cigdetPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s, "#");
				createIgdetrCode.add(tokens.nextToken());
				createIgdet.add(tokens.nextToken());
				createIgdetCpcty.add(tokens.nextToken());
			
			}
			bos.close();

			for (int k = 0; k < createIgdet.size(); k++) { // 입력받은 재료 레시피코드와 txt파일에서 받은 레시피코드를 비교 후
				if (createIgdet.get(k).equals(igdet)) {
					Array.add(Integer.parseInt(createIgdetrCode.get(k)));
				}
			} // 일치하는것이 있으면 배열에 입력

		} catch (Exception e) {

		}

	}

	private static String getTagValue(String tag, Element eElement) { // api에서 데이터 파싱하는 메소드
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);
		if (nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}

	public static void rcpInfoReader() { // 레시피 기본정보 가지고와서 rcpInfo배열에 바로 입력함 메소드
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000226_1/1/1000";
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();

			NodeList nList1 = doc1.getElementsByTagName("row");

			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode = nList1.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String rCode = getTagValue("RECIPE_ID", eElement);
					String rName = getTagValue("RECIPE_NM_KO", eElement);
					String rSumry = getTagValue("SUMRY", eElement);
					String rLevel = getTagValue("LEVEL_NM", eElement);
					rCodeList[temp] = rCode;
					rNameList[temp] = rName;
					rSumryList[temp] = rSumry;
					rLevelList[temp] = rLevel;
				}
			}
			String s;
			int count = nList1.getLength();
			BufferedReader bos = new BufferedReader(new FileReader(cInfoPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s, "#");
				rCodeList[count] = tokens.nextToken();
				rNameList[count] = tokens.nextToken();
				rSumryList[count] = tokens.nextToken();
				rLevelList[count] = tokens.nextToken();
				count++;
			}
			bos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void print(List<String> arr4) { // 알고리즘에 의해 정리된배열에 저장해놓은 기본정보 중에서 입력한 재료 레시피 코드랑 겹치는 기본정보 출력
		for (int i = 0; i < arr4.size(); i++) {
			for (int k = 0; k < rCodeList.length; k++) {
				if (arr4.get(i).equals(rCodeList[k])) {
					rNameList2[q] = rNameList[k];
					rLevelList2[q] = rLevelList[k];
					rSumryList2[q] = rSumryList[k];
					q++;
				}
			}
		}
		int p = 0;
		for (int i = 0; i < q; i++) { // 초보 환영의 난이도 저장
			if (rLevelList2[i].equals("초보환영")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { // 보통의 난이도 저장
			if (rLevelList2[i].equals("보통")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { // 어려움의 난이도 저장
			if (rLevelList2[i].equals("어려움")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}

		p = 0;
		for (int i = 0; i < q; i++) { // 어려움의 난이도 출력
			if (rLevelList2[i].equals("어려움")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { // 보통의 난이도 저장
			if (rLevelList2[i].equals("보통")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { // 초보환영의 난이도 저장
			if (rLevelList2[i].equals("초보환영")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}

		Name n = new Name();
		n.setAlname(rNameList2);
		n.setAlsumry(rSumryList2);
		n.setAllevel(rLevelList2);
		n.setHiname(rNameList4);
		n.setHisumry(rSumryList4);
		n.setHilevel(rLevelList4);
		n.setLowname(rNameList3);
		n.setLowsumry(rSumryList3);
		n.setLowlevel(rLevelList3);

	}

	public static void inputRcp(String irName) {
		String crCode = null; // 입력받은 음식과 일치하면 레시피코드를 저장하는 변수
		for (int k = 0; k < rCodeList.length; k++) { // 이름 비교해서 맞으면
			if (irName.equals(rNameList[k])) { // crCode에 요리를 하고싶은 음식의 레시피코드를 넣음
				crCode = rCodeList[k];

			}
		}
		rcpProcess(crCode);
		rcpIgdetInfo(crCode);
	}

	public static void rcpProcess(String rcpdc) { // 레시피 과정정보 가져와서 출력
		try {
			Info i = new Info();
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000228_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID", "UTF-8") + "="
					+ URLEncoder.encode(rcpdc, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();

			NodeList nList1 = doc1.getElementsByTagName("row");
			String[] cookDc = new String[10];
			int m = 0;
			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode = nList1.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					cookDc[m] = getTagValue("COOKING_DC", eElement);
					m++;
				}
			}

			String s;
			BufferedReader bos = new BufferedReader(new FileReader(crcpPath)); // creatercpdc.txt파일 불러오는거
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s, "#");
				createRcpDcrCode.add(tokens.nextToken());
				createRcpDcNo.add(tokens.nextToken());
				createRcpDc.add(tokens.nextToken());
			}
			bos.close();
			for (int k = 0; k < createRcpDcrCode.size(); k++) { // 입력한 레시피코드가 txt파일에 있으면 여기서 출력
				if (createRcpDcrCode.get(k).equals(rcpdc)) {
					cookDc[m] = createRcpDc.get(k);
					m++;
				}
			}
			i.setDc(cookDc); // 과정 정보를 저장
		} catch (Exception e) {
		}

	}

	public static void rcpIgdetInfo(String rcpIgdet) { // 레시피 과정정보 가져와서 출력
		String[] cookRd = new String[20];
		Info i = new Info();
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000227_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID", "UTF-8") + "="
					+ URLEncoder.encode(rcpIgdet, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();

			NodeList nList1 = doc1.getElementsByTagName("row");
			int m = 0;
			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode = nList1.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					cookRd[m] = getTagValue("IRDNT_NM", eElement) + " " + getTagValue("IRDNT_CPCTY", eElement);
					m++;
				}
			}

			for (int k = 0; k < createIgdetrCode.size(); k++) { // txt파일과 일치하는게 있으면
				if (createIgdetrCode.get(k).equals(rcpIgdet)) {
					cookRd[m] = createIgdet.get(k) + " " + createIgdetCpcty.get(k);
					m++;
				}
			}
			i.setRd(cookRd); // 재료 정보 저장
		} catch (Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}
}
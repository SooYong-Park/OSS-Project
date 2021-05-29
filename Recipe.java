import java.net.URLEncoder;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;

public class Recipe{
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

	public static void R() {
		rcpInfoReader(); 								// 레시피 기본정보 txt에 담는 메소드 호출
		try {
			Algorithm a = new Algorithm();
			Scanner sc = new Scanner(System.in);
			System.out.print("입력할 재료 수 입력(최대 3개까지 입력 가능) : ");
			int count = sc.nextInt();
			sc.nextLine();
			// String igdet = "호박잎";
			for (int j = 0; j < count; j++) {
				System.out.print("재료 입력 : ");
				String igdet = sc.nextLine();
				String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
						+ "xml/Grid_20150827000000000227_1/1/200" + "?" + URLEncoder.encode("IRDNT_NM", "UTF-8") + "="
						+ URLEncoder.encode(igdet, "UTF-8");

				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(url);
				doc.getDocumentElement().normalize();
				System.out.println("Root element : " + doc.getDocumentElement().getNodeName());

				NodeList nList = doc.getElementsByTagName("row");
				System.out.println("재료가 들어가있는 음식 수 : " + nList.getLength());
				for (int temp = 0; temp < nList.getLength(); temp++) { // 리스트의 개수만큼 데이터를 끌어와서 Array라는 배열에 저장
					Node nNode = nList.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						String rCode = getTagValue("RECIPE_ID", eElement);
						int int_val = Integer.parseInt(rCode);
						Array.add(int_val);

					} // if문
				} // for문
			}
			String s;
			BufferedReader bos = new BufferedReader(new FileReader(cigdetPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s, "/");
				createIgdetrCode.add(tokens.nextToken());
				createIgdet.add(tokens.nextToken());
				createIgdetCpcty.add(tokens.nextToken());
			}
			bos.close();
			/*
			 * for(int k = 0 ; k<createIgdet.size(); k++) {
			 * if(createIgdet.get(k).equals(igdet)) {
			 * Array.add(Integer.parseInt(createIgdetrCode.get(k))); } }
			 */
			a.Algorithm(Array);
		} catch (Exception e) {
			System.out.println("오류");
			System.out.println(e);
		} // 예외처리
	}

	private static String getTagValue(String tag, Element eElement) { 						// api에서 데이터 파싱하는 메소드
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();

		Node nValue = (Node) nlList.item(0);
		if (nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}

	public static void rcpInfoReader() { 									// 레시피 기본정보 가지고와서 rcpInfo배열에 바로 입력함 메소드
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000226_1/1/1000";
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();
			System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());

			NodeList nList1 = doc1.getElementsByTagName("row");
			System.out.println("업데이트 된 기본정보 데이터 수 : " + nList1.getLength());

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
				StringTokenizer tokens = new StringTokenizer(s, "/");
				rCodeList[count] = tokens.nextToken();
				rNameList[count] = tokens.nextToken();
				rSumryList[count] = tokens.nextToken();
				rLevelList[count] = tokens.nextToken();
				count++;
			}
			bos.close();
		} catch (Exception e) {
			System.out.println("rcpInfoReader 오류");
			System.out.println(e);
		}
	}

	public void print(List<String> arr4) { 							// 알고리즘에 의해 정리된배열에 저장해놓은 기본정보 중에서 입력한 재료 레시피 코드랑 겹치는 기본정보 출력
		for (int i = 0; i < arr4.size(); i++) {
			for (int k = 0; k < rCodeList.length; k++) {
				if (arr4.get(i).equals(rCodeList[k])) {
					rNameList2[q] = rNameList[k];
					rLevelList2[q] = rLevelList[k];
					rSumryList2[q] = rSumryList[k];
					q++;

					System.out.println("레시피 이름 : " + rNameList[k] + " 레시피 난이도 : " + rLevelList[k]);
					System.out.println("간략 요약 : " + rSumryList[k]);
				}
			}
		}
		int p = 0;
		for (int i = 0; i < q; i++) { 							// 초보 환영의 난이도 출력
			if (rLevelList2[i].equals("초보환영")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { 								// 보통의 난이도 저장
			if (rLevelList2[i].equals("보통")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) {									 // 어려움의 난이도 저장
			if (rLevelList2[i].equals("어려움")) {
				rNameList3[p] = rNameList2[i];
				rLevelList3[p] = rLevelList2[i];
				rSumryList3[p] = rSumryList2[i];
				p++;
			}
		}
		
		p = 0;
		for (int i = 0; i < q; i++) { 							// 어려움의 난이도 출력
			if (rLevelList2[i].equals("어려움")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) { 								// 보통의 난이도 저장
			if (rLevelList2[i].equals("보통")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) {									 // 초보환영의 난이도 저장
			if (rLevelList2[i].equals("초보환영")) {
				rNameList4[p] = rNameList2[i];
				rLevelList4[p] = rLevelList2[i];
				rSumryList4[p] = rSumryList2[i];
				p++;
			}
		}
		for (int i = 0; i < q; i++) {
			System.out.println("+++++++++" + rLevelList3[i] + "/" + rNameList3[i]);		// 초보 ~ 어려움
		}
		for (int i = 0; i < q; i++) {
			System.out.println("반대로 : " + rLevelList4[i] + "/" + rNameList4[i]);		// 어려움 ~ 초보
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요리할 음식 이름 입력 : ");
		String irName;
		String crCode = null;
		irName = sc2.nextLine();
		for (int k = 0; k < rCodeList.length; k++) {
			if (irName.equals(rNameList[k])) {
				crCode = rCodeList[k];

			}
		}
		rcpIgdetInfo(crCode);
		rcpProcess(crCode);
	}

	public static void rcpProcess(String rcpdc) { 						// 레시피 과정정보 가져와서 출력
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000228_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID", "UTF-8") + "="
					+ URLEncoder.encode(rcpdc, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();
			System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());

			NodeList nList1 = doc1.getElementsByTagName("row");
			System.out.println("요리 과정 데이터 수 : " + nList1.getLength());

			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode = nList1.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("조리 순서  : " + getTagValue("COOKING_NO", eElement));
					System.out.println("조리 방법  : " + getTagValue("COOKING_DC", eElement));
				}
			}
			String s;
			BufferedReader bos = new BufferedReader(new FileReader(crcpPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s, "/");
				createRcpDcrCode.add(tokens.nextToken());
				createRcpDcNo.add(tokens.nextToken());
				createRcpDc.add(tokens.nextToken());
			}
			bos.close();
			for (int k = 0; k < createRcpDcrCode.size(); k++) {
				if (createRcpDcrCode.get(k).equals(rcpdc)) {
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("조리 순서  : " + createRcpDcNo.get(k));
					System.out.println("조리 방법  : " + createRcpDc.get(k));
				}
			}
		} catch (Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}

	public static void rcpIgdetInfo(String rcpIgdet) { 									// 레시피 과정정보 가져와서 출력
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000227_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID", "UTF-8") + "="
					+ URLEncoder.encode(rcpIgdet, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(url1);
			doc1.getDocumentElement().normalize();
			System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());

			NodeList nList1 = doc1.getElementsByTagName("row");
			System.out.println("필요한 재료 수 : " + nList1.getLength());

			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode = nList1.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("재료 이름  : " + getTagValue("IRDNT_NM", eElement));
					System.out.println("재료 용량  : " + getTagValue("IRDNT_CPCTY", eElement));
				}
			}
			for (int k = 0; k < createIgdetrCode.size(); k++) {
				if (createIgdetrCode.get(k).equals(rcpIgdet)) {
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("재료 이름  : " + createIgdet.get(k));
					System.out.println("재료 용량  : " + createIgdetCpcty.get(k));
				}
			}
		} catch (Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}
}
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
import java.io.IOException;

import javax.swing.*;

public class Recipe {
	static String rCodeList[] = new String[500000];
	static String rNameList[] = new String[500000];
	static String rSumryList[] = new String[500000];
	static String rLevelList[] = new String[500000];
	static String recipeList[] = new String[500000];
	static String recipeList2[] = new String[5000];
	static List<Integer> Array = new ArrayList<Integer>();
	static List<String> arr = new ArrayList<String>();
	static int count = 0;
	Checkbox c1, c2, c3;
	TextField b4, b5, b6;

	public Recipe() {
	
		rcpInfoReader(); // 레시피 기본정보 txt에 담는 메소드 호출
		Algorithm a = new Algorithm();

		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("입력할 재료 수 입력(최소 1개 ~ 최대 5개까지 입력 가능) : ");
			int count = sc.nextInt();
			sc.nextLine();
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

					}
				}
			}
			a.Algorithm(Array);
		} catch (Exception e) {
			System.out.println("오류");
			System.out.println(e);
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
			try {
				String s;
				count = nList1.getLength();
				BufferedReader bos = new BufferedReader(new FileReader("창작요리.txt"));
				while ((s = bos.readLine()) != null) {
					StringTokenizer tokens = new StringTokenizer(s,"/");
					rCodeList[count] = tokens.nextToken();
					rNameList[count] = tokens.nextToken();
					rSumryList[count] = tokens.nextToken();
					rLevelList[count] = tokens.nextToken();
					recipeList[count] = tokens.nextToken();
					count++;
				}

				bos.close();
			} catch (IOException E10) {
				E10.printStackTrace();
			}
			String s;
			for(int i = nList1.getLength() ; i < count; i++) {
				s = recipeList[i];
				StringTokenizer tokens = new StringTokenizer(s,",| ");
				recipeList2[i] = tokens.nextToken();
			}
		} catch (Exception e) {
			System.out.println("rcpInfoReader 오류");
		}
	}
	static String rNameList2[] = new String[100];
	static String rLevelList2[] = new String[100];
	static String rSumryList2[] = new String[100];
	static String rNameList3[] = new String[10];
	static String rLevelList3[] = new String[10];
	static String rSumryList3[] = new String[10];
	static int q = 0;
	public static void print(String[]arr3) { // 알고리즘에 의해 정리된배열에 저장해놓은 기본정보 중에서 입력한 재료 레시피 코드랑 겹치는 기본정보 출력
		for (int i = 0; i < rCodeList.length; i++) {
			for (int k = 0; k < arr3.length; k++) {						// 중복되는 순서부터 출력
				if (arr3[i].equals(rCodeList[k])) {
					rNameList2[q] = rNameList[k];
					rLevelList2[q] = rLevelList[k];
					rSumryList2[q] = rSumryList[q];
					q++;
					System.out.println("레시피 이름 : " + rNameList[k] + " 레시피 난이도 : " + rLevelList[k]);
					System.out.println("간략 요약 : " + rSumryList[k]);
				}
			}
		}
		q = 0;
		for(int i = 0; i < 100; i++) {							// 초보 환영의 난이도 출력
			if(rLevelList2[i] == "초보 환영") {
				rNameList3[q] = rNameList2[i];
				rLevelList3[q] = rLevelList2[i];
				rLevelList2[q] = rSumryList2[i];
				q++;
			}
		}
		q = 0;
		for(int i = 0; i < 100; i++) {							// 보통의 난이도 출력
			if(rLevelList2[i] == "보통") {
				rNameList3[q] = rNameList2[i];
				rLevelList3[q] = rLevelList2[i];
				rLevelList2[q] = rSumryList2[i];
				q++;
			}
		}
		q = 0;
		for(int i = 0; i < 100; i++) {								// 어려움의 난이도 출력
			if(rLevelList2[i] == "어려움") {
				rNameList3[q] = rNameList2[i];
				rLevelList3[q] = rLevelList2[i];
				rLevelList2[q] = rSumryList2[i];
				q++;
			}
		}
		

		Scanner sc2 = new Scanner(System.in);
		System.out.println("요리할 음식 이름 입력 : ");
		String irName = sc2.nextLine();
		String crCode = null;
		for (int k = 0; k < rCodeList.length; k++) {
			if (irName.equals(rNameList[k])) {
				crCode = rCodeList[k];
			}
		}
		rcpIgdetInfo(crCode);
		rcpProcess(crCode);
	}

	public static void rcpProcess(String rcpdc) { 			// 레시피 과정정보 가져와서 출력
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
		} catch (Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}

	public static void rcpIgdetInfo(String rcpIgdet) { // 레시피 과정정보 가져와서 출력
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
					System.out.println("재료 중요도  : " + getTagValue("IRDNT_TY_NM", eElement));
				}
			}
		} catch (Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}
}
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

public class Recipe extends JFrame implements ActionListener{
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

	Checkbox c1, c2, c3;
	TextField b4, b5, b6;

	public Recipe() {
	
		Panel p = new Panel();
		p.setLayout(null);
		Label t1 = new Label("재료의 갯수를 클릭해주세요");
		add(t1);
		Label t2 = new Label("재료는 3개까지 입력가능합니다");
		add(t2);
		Label b1 = new Label("재료1:");
		add(b1);
		Label b2 = new Label("재료2:");
		add(b2);
		Label b3 = new Label("재료3:");
		b4 = new TextField();
		add(b4);
		b5 = new TextField();
		add(b5);
		b6 = new TextField();
		add(b6);
		Button b7 = new Button("입력");
		add(b7);
		c1 = new Checkbox("1");
		add(c1);
		c2 = new Checkbox("2");
		add(c2);
		c3 = new Checkbox("3");
		add(c3);

		t1.setBounds(180, 5, 200, 40);
		t2.setBounds(180, 35, 280, 40);

		b1.setBounds(40, 225, 40, 40);
		b2.setBounds(40, 265, 40, 40);
		b3.setBounds(40, 305, 60, 40);
		b4.setBounds(150, 225, 200, 30);
		b5.setBounds(150, 265, 200, 30);
		b6.setBounds(150, 305, 200, 30);

		b7.setBounds(380, 225, 120, 110);

		c1.setBounds(180, 80, 80, 50);
		c2.setBounds(260, 80, 80, 50);
		c3.setBounds(340, 80, 80, 50);

		add(p);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("재료 선택 화면");
		setVisible(true);
		rcpInfoReader();	//레시피 기본정보 txt에 담는 메소드 호출
		System.out.println("기능을 선택하시오 1.재료입력 2.창작요리등록 3.종료");
		while(true) {
			Scanner s = new Scanner(System.in);
			int menu = s.nextInt();
			switch(menu) {//메뉴를 선택하기위한 switch문
			case 1:
				inputIgdet();
				break;
			case 2:
				//createRcp();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
	}	//main 메소드
	public static void inputIgdet() {
		try {
			Algorithm a = new Algorithm();
			Scanner sc = new Scanner(System.in);
			System.out.print("입력할 재료 수 입력(최대 3개까지 입력 가능) : ");
			int count = sc.nextInt();
			sc.nextLine();
			String igdet = "호박잎";
			for(int j = 0; j < count; j ++) {
				System.out.print("재료 입력 : ");
				//String igdet = sc.nextLine();
				String url = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
						+ "xml/Grid_20150827000000000227_1/1/200" + "?" + URLEncoder.encode("IRDNT_NM","UTF-8") + "=" + URLEncoder.encode(igdet, "UTF-8");
				
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(url);
                doc.getDocumentElement().normalize();
                System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
                
                NodeList nList = doc.getElementsByTagName("row");
                System.out.println("재료가 들어가있는 음식 수 : " + nList.getLength());
                for(int temp = 0; temp < nList.getLength(); temp++) {	//리스트의 개수만큼 데이터를 끌어와서 Array라는 배열에 저장
                	Node nNode = nList.item(temp);
                	if(nNode.getNodeType() == Node.ELEMENT_NODE){
                		Element eElement = (Element) nNode;
                		String rCode = getTagValue("RECIPE_ID", eElement);
                		int int_val = Integer.parseInt(rCode);
                		Array.add(int_val);
                		
                	}	//if문
                }	//for문
			}
			String s;
			BufferedReader bos = new BufferedReader(new FileReader(cigdetPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s,"/");
				createIgdetrCode.add(tokens.nextToken());
				createIgdet.add(tokens.nextToken());
				createIgdetCpcty.add(tokens.nextToken());
			}
			bos.close();
			for(int i = 0; i<createIgdetrCode.size(); i++) {
				System.out.println(createIgdetrCode.get(i));
			}
			for(int k = 0 ; k<createIgdet.size(); k++) {
				if(createIgdet.get(k).equals(igdet)) {
					Array.add(Integer.parseInt(createIgdetrCode.get(k)));
				}
			}
			for(int i = 0; i<Array.size(); i++) {
				System.out.println(Array.get(i));
			}
			
			ca.Algorithm(Array);
		}catch(Exception e){
			System.out.println("오류");
			System.out.println(e);
		}	//예외처리
	}

	private static String getTagValue(String tag, Element eElement) {	//api에서 데이터 파싱하는 메소드(건들 필요 없을거얌)
		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
		
		Node nValue = (Node) nlList.item(0);
		if(nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}
	
	public static void rcpInfoReader() {	//레시피 기본정보 가지고와서 rcpInfo배열에 바로 입력함 메소드(이거도 건들 필요 없을거얌)
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
			
			for(int temp = 0; temp < nList1.getLength(); temp++) {
            	Node nNode = nList1.item(temp);
            	if(nNode.getNodeType() == Node.ELEMENT_NODE){
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
				StringTokenizer tokens = new StringTokenizer(s,"/");
				rCodeList[count] = tokens.nextToken();
				rNameList[count] = tokens.nextToken();
				rSumryList[count] = tokens.nextToken();
				rLevelList[count] = tokens.nextToken();
				count++;
			}
			bos.close();
		}catch(Exception e) {
			System.out.println("rcpInfoReader 오류");
			System.out.println(e);
		}
	}
	public void print(List<String> arr4) {	//알고리즘에 의해 정리된배열에 저장해놓은 기본정보 중에서 입력한 재료 레시피 코드랑 겹치는 기본정보 출력
		for(int i = 0 ; i<arr4.size(); i++) {
			for(int k = 0 ; k<rCodeList.length; k++) {
				if(arr4.get(i).equals(rCodeList[k])) {
					System.out.println("레시피 이름 : " + rNameList[k] + " 레시피 난이도 : " + rLevelList[k]);
					System.out.println("간략 요약 : " + rSumryList[k]);
				}
			}
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.println("요리할 음식 이름 입력 : ");
		String irName;
		String crCode = null;
		irName = sc2.nextLine();
		for(int k = 0 ; k<rCodeList.length; k++) {
			if(irName.equals(rNameList[k])) {
				crCode = rCodeList[k];
				
			}
		}
		rcpIgdetInfo(crCode);
		rcpProcess(crCode);
	}
	
	public static void rcpProcess(String rcpdc) {	//레시피 과정정보 가져와서 출력
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000228_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID","UTF-8") + "=" + URLEncoder.encode(rcpdc, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
            Document doc1 = dBuilder1.parse(url1);
            doc1.getDocumentElement().normalize();
            System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());
            
            NodeList nList1 = doc1.getElementsByTagName("row");
            System.out.println("요리 과정 데이터 수 : " + nList1.getLength());
			
			for(int temp = 0; temp < nList1.getLength(); temp++) {
            	Node nNode = nList1.item(temp);
            	if(nNode.getNodeType() == Node.ELEMENT_NODE){
            		Element eElement = (Element) nNode;
            		System.out.println("+++++++++++++++++++++++++");
            		System.out.println("조리 순서  : " + getTagValue("COOKING_NO", eElement));
            		System.out.println("조리 방법  : " + getTagValue("COOKING_DC", eElement));
            	}
            }
			String s;
			BufferedReader bos = new BufferedReader(new FileReader(crcpPath));
			while ((s = bos.readLine()) != null) {
				StringTokenizer tokens = new StringTokenizer(s,"/");
				createRcpDcrCode.add(tokens.nextToken());
				createRcpDcNo.add(tokens.nextToken());
				createRcpDc.add(tokens.nextToken());
			}
			bos.close();
			for(int k = 0 ; k<createRcpDcrCode.size(); k++) {
				if(createRcpDcrCode.get(k).equals(rcpdc)) {
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("조리 순서  : " + createRcpDcNo.get(k));
					System.out.println("조리 방법  : " + createRcpDc.get(k));
				}
			}
		}catch(Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}
	public static void rcpIgdetInfo(String rcpIgdet) {	//레시피 과정정보 가져와서 출력
		try {
			String url1 = "http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/"
					+ "xml/Grid_20150827000000000227_1/1/20" + "?" + URLEncoder.encode("RECIPE_ID","UTF-8") + "=" + URLEncoder.encode(rcpIgdet, "UTF-8");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
            Document doc1 = dBuilder1.parse(url1);
            doc1.getDocumentElement().normalize();
            System.out.println("Root element : " + doc1.getDocumentElement().getNodeName());
            
            NodeList nList1 = doc1.getElementsByTagName("row");
            System.out.println("필요한 재료 수 : " + nList1.getLength());
			
			for(int temp = 0; temp < nList1.getLength(); temp++) {
            	Node nNode = nList1.item(temp);
            	if(nNode.getNodeType() == Node.ELEMENT_NODE){
            		Element eElement = (Element) nNode;
            		System.out.println("+++++++++++++++++++++++++");
            		System.out.println("재료 이름  : " + getTagValue("IRDNT_NM", eElement));
            		System.out.println("재료 용량  : " + getTagValue("IRDNT_CPCTY", eElement));
            	}
            }
			for(int k = 0 ; k<createIgdetrCode.size(); k++) {
				if(createIgdetrCode.get(k).equals(rcpIgdet)) {
					System.out.println("+++++++++++++++++++++++++");
					System.out.println("재료 이름  : " + createIgdet.get(k));
					System.out.println("재료 용량  : " + createIgdetCpcty.get(k));
				}
			}
		}catch(Exception e) {
			System.out.println("과정정보 불러오기 오류");
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiTest { //과정정보
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder1 = new StringBuilder("http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/xml/Grid_20150827000000000226_1/1/6"); //기본정보
        StringBuilder urlBuilder2 = new StringBuilder("http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/xml/Grid_20150827000000000227_1/1/6"); //재료정보
        //StringBuilder urlBuilder3 = new StringBuilder("http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/xml/Grid_20150827000000000228_1/1/6"); //과정정보
        StringBuilder urlBuilder4 = new StringBuilder("http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/xml/Grid_20150827000000000227_1/1/6"); //재료정보
        //urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder1.append("?" + URLEncoder.encode("RECIPE_ID","UTF-8") + "=" + URLEncoder.encode("428", "UTF-8")); //숫자 부분에 레시피 코드를 입력
        urlBuilder2.append("?" + URLEncoder.encode("IRDNT_NM","UTF-8") + "=" + URLEncoder.encode("배추김치", "UTF-8")); //숫자 부분에 레시피 코드를 입력
        urlBuilder4.append("?" + URLEncoder.encode("IRDNT_NM","UTF-8") + "=" + URLEncoder.encode("돼지고기", "UTF-8")); /*xml 과 json 형식 지원*/
        //urlBuilder.append("&" + URLEncoder.encode("Page_No","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호*/
        //urlBuilder.append("&" + URLEncoder.encode("Page_Size","UTF-8") + "=" + URLEncoder.encode("20", "UTF-8")); /*한 페이지 결과 수*/
        //urlBuilder.append("&" + URLEncoder.encode("food_Name","UTF-8") + "=" + URLEncoder.encode("찌개", "UTF-8")); /*음식 명 (검색어 입력값 포함 검색)*/
        //urlBuilder.append("&" + URLEncoder.encode("ckry_Name","UTF-8") + "=" + URLEncoder.encode("조리", "UTF-8")); /*조리법 명 (검색어 입력값 포함 검색)*/
        URL url1 = new URL(urlBuilder1.toString());
        HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
        conn1.setRequestMethod("GET");
        conn1.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn1.getResponseCode());
        BufferedReader rd1;
        if(conn1.getResponseCode() >= 200 && conn1.getResponseCode() <= 300) {
            rd1 = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
        } else {
            rd1 = new BufferedReader(new InputStreamReader(conn1.getErrorStream()));
        }
        StringBuilder sb1 = new StringBuilder();
        String line1;
        while ((line1 = rd1.readLine()) != null) {
            sb1.append(line1);
        }
        rd1.close();
        conn1.disconnect();  
        System.out.println(sb1.toString()); //기본정보
        
        
        URL url2 = new URL(urlBuilder2.toString());
        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
        conn2.setRequestMethod("GET");
        conn2.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn2.getResponseCode());
        BufferedReader rd2;
        if(conn2.getResponseCode() >= 200 && conn2.getResponseCode() <= 300) {
            rd2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
        } else {
            rd2 = new BufferedReader(new InputStreamReader(conn2.getErrorStream()));
        }
        StringBuilder sb2 = new StringBuilder();
        String line2;
        while ((line2 = rd2.readLine()) != null) {
            sb2.append(line2);
        }
        rd2.close();
        conn2.disconnect();
        System.out.println(sb2.toString());  //재료정보
        
        URL url3 = new URL(urlBuilder4.toString());
        HttpURLConnection conn3 = (HttpURLConnection) url3.openConnection();
        conn3.setRequestMethod("GET");
        conn3.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn3.getResponseCode());
        BufferedReader rd3;
        if(conn3.getResponseCode() >= 200 && conn3.getResponseCode() <= 300) {
            rd3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
        } else {
            rd3 = new BufferedReader(new InputStreamReader(conn3.getErrorStream()));
        }
        StringBuilder sb3 = new StringBuilder();
        String line3;
        while ((line3 = rd3.readLine()) != null) {
            sb3.append(line3);
        }
        rd3.close();
        conn3.disconnect();
        System.out.println(sb3.toString());
    }
}
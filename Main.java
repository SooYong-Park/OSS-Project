import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class Main { //과정정보
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://211.237.50.150:7080/openapi/b53b81c76f8bc68b7fe1b656852cd6f0e5a50bfc1466e8f222272725be332249/xml/Grid_20150827000000000228_1/1/6"); /*URL*/
        //urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder.append("?" + URLEncoder.encode("RECIPE_ID","UTF-8") + "=" + URLEncoder.encode("428", "UTF-8")); /*공공데이터포털에서 발급받은 인증키*/
        //urlBuilder.append("&" + URLEncoder.encode("RECIPE_NM_KO","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*xml 과 json 형식 지원*/
        //urlBuilder.append("&" + URLEncoder.encode("Page_No","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호*/
        //urlBuilder.append("&" + URLEncoder.encode("Page_Size","UTF-8") + "=" + URLEncoder.encode("20", "UTF-8")); /*한 페이지 결과 수*/
        //urlBuilder.append("&" + URLEncoder.encode("food_Name","UTF-8") + "=" + URLEncoder.encode("찌개", "UTF-8")); /*음식 명 (검색어 입력값 포함 검색)*/
        //urlBuilder.append("&" + URLEncoder.encode("ckry_Name","UTF-8") + "=" + URLEncoder.encode("조리", "UTF-8")); /*조리법 명 (검색어 입력값 포함 검색)*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
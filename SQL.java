import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;

public class SQL { 
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // jdbc 드라이버 주소
	static final String DB_URL = "jdbc:mysql://localhost:3306/member?useSSL=false"; // DB 접속 주소
	 
	static final String USERNAME = "root"; // DB ID
	static final String PASSWORD = "1234"; // DB Password 
	private Connection conn = null; 
	private Statement stmt = null; 
	private ResultSet rs = null; 
	public SQL() { 
		System.out.print("User Table 접속 : "); 
		try { 
			Class.forName(JDBC_DRIVER); //Class 클래스의 forName()함수를 이용해서 해당 클래스를 메모리로 로드 하는 것입니다. //URL, ID, password를 입력하여 데이터베이스에 접속합니다. 
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); // 접속결과를 출력합니다. 
			if (conn != null){
				System.out.println("성공");
			} 
			else{
				System.out.println("실패");
			} 
		} catch (ClassNotFoundException e) { 
			System.out.println("Class Not Found Exection"); 
		e.printStackTrace(); 
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e.getMessage()); 
			e.printStackTrace();
		}
	}
	
	public void tableInsert(int no, String name) {
		TableName tn = new TableName(no,name);
		String query = "INSERT INTO table_name" + "VALUE("+tn.no+","+tn.name+")"; 
		System.out.println(query);
		try {
		Class.forName(JDBC_DRIVER); 
		conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		stmt = conn.createStatement(); //데이터베이스에 query문을 넘길 Statement를 만들어줍니다. 
		stmt.executeUpdate(query); // query를 실행시킵니다. 
		stmt.close(); 
		conn.close(); 
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exection"); 
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e.getMessage()); 
		} 
	}
	
	public void tableSelect() {
		String query = "SELECT *FROM Table_Name";
		TableName tn = new TableName();
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				tn.setNo(rs.getInt("no"));
				tn.setName(rs.getString("name"));
				
				System.out.println("no :" + tn.getNo() + "name : " + tn.name);
			}
			stmt.close();
			
			stmt.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exection");
		}catch (SQLException e) {
			System.out.println("SQL Exception :" + e.getMessage());
		}
	}
}
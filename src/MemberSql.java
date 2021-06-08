import java.sql.*;

import javax.swing.JOptionPane;


public class MemberSql {
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/member";
   static final String USERNAME = "root"; // DB ID
   static final String PASSWORD = "1234"; // DB Password
   private Connection conn = null;
   private Statement stmt = null;
   private ResultSet rs = null;

   public void connectDB() {
      try {
         Class.forName(JDBC_DRIVER); // Class 클래스의 forName()함수를 이용해서 해당 클래스를 메모리로 로드 하는 것입니다. //URL, ID, password를
                              // 입력하여 데이터베이스에 접속합니다.
         conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD); // 접속결과를 출력합니다.
      } catch (ClassNotFoundException e) {
         System.out.println("Class Not Found Exection");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("SQL Exception : " + e.getMessage());
         e.printStackTrace();
      }

   }

   public void inputMember() {

   }

   public void tableInsert(String name, String id, int pass, String adress, String etc) {
      String query = "INSERT INTO info" + " (name, id, pass, adress, etc) " + " VALUES (" + "\"" + name + "\"" + ","
            + "\"" + id + "\"" + "," + "\"" + pass + "\"" + "," + "\"" + adress + "\"" + "," + "\"" + etc + "\""
            + ");";
      try {
         Class.forName(JDBC_DRIVER);
         conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
         stmt = conn.createStatement(); // 데이터베이스에 query문을 넘길 Statement를 만들어줍니다.
         stmt.executeUpdate(query); // query를 실행시킵니다.
         stmt.close();
         conn.close();
      } catch (ClassNotFoundException e) {
         System.out.println("Class Not Found Exection");
      } catch (SQLException e) {
         System.out.println("SQL Exception : " + e.getMessage());
      }
   }

   public void tableSelect(String ID, int PASS) {
      String query = "SELECT *FROM info";
      TableName tn = new TableName();
      Select se = new Select();
      MyFood mf = new MyFood();
      FirstSwing f = new FirstSwing();
      int count = 0;
      try {
         Class.forName(JDBC_DRIVER);
         conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);

         while (rs.next()) {
            tn.setname(rs.getString("name"));
            tn.setid(rs.getString("id"));
            tn.setpass(rs.getInt("pass"));
            tn.setadress(rs.getString("adress"));
            tn.setetc(rs.getString("etc"));
            if (ID.equals(rs.getString("id")) && PASS == rs.getInt("pass")) {
               se.getId(ID);
               mf.getId(String.valueOf(PASS));
               JOptionPane.showMessageDialog(null, "로그인이 되었습니다!!");
               count++;
               f.first();
            }
         }
         if (count == 0) {
                JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
             }
         stmt.close();

         stmt.close();
         conn.close();
      } catch (ClassNotFoundException e) {
         System.out.println("Class Not Found Exection");
      } catch (SQLException e) {
         System.out.println("SQL Exception :" + e.getMessage());
      }
   }

}

class TableName {
   String name;
   String id;
   int pass;
   String adress;
   String etc;

   public TableName() {

   }

   public TableName(String name, String id, int pass, String adress, String etc) {
      super();
      this.name = name;
      this.id = id;
      this.pass = pass;
      this.adress = adress;
      this.etc = etc;
   }

   public String getname() {
      return name;
   }

   public void setname(String name) {
      this.name = name;
   }

   public String getid() {
      return id;
   }

   public void setid(String id) {
      this.id = id;
   }

   public int getpass() {
      return pass;
   }

   public void setpass(int pass) {
      this.pass = pass;
   }

   public String getadress() {
      return adress;
   }

   public void setadress(String adress) {
      this.adress = adress;
   }

   public String getetc() {
      return etc;
   }

   public void setetc(String etc) {
      this.etc = etc;
   }
}
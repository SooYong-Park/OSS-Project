public class Main123 {

	public static void main(String[] args) {
		Login l = new Login();
		l.login();
		MemberSql m = new MemberSql();
		m.connectDB();
	}
}

public class Control {

	public static void main(String[] args) {
		SQL sql = new SQL();
		
		sql.tableInsert(1, "kim");
		sql.tableInsert(2, "park");
		sql.tableInsert(3, "lee");

		sql.tableSelect();
	}

}

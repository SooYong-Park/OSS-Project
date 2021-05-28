import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MyFood {
	public MyFood() {
		Scanner scn = new Scanner(System.in);
		String Id = scn.next();
		String FoodName = scn.next();
		String FoodRecipe = scn.next();
		String FoodMake = scn.next();
		String Level = scn.next();

		try {
			File file = new File("C:\\MyTemp\\MyFood.txt");
			FileWriter fileWrite = new FileWriter(file, true);

			String s = (Id + " " + FoodName + " " + FoodRecipe + " " + FoodMake + " " + Level);
			fileWrite.write(s + "\r\n");
			fileWrite.flush();
			fileWrite.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

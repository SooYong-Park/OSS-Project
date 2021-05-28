import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFood {

	public void MyFoodWrite() {
		Scanner scn = new Scanner(System.in);
		String Id = scn.nextLine();
		String FoodName = scn.nextLine();
		String FoodRecipe = scn.nextLine();
		String FoodMake = scn.nextLine();
		String Level = scn.nextLine();

		try {
			File file = new File("C:\\Users\\sms14\\eclipse-workspace\\Food\\창작요리.txt");
			FileWriter fileWrite = new FileWriter(file, true);

			String s = (Id + "/" + FoodName + "/" + FoodRecipe + "/" + FoodMake + "/" + Level);
			fileWrite.write(s + "\r\n");
			fileWrite.flush();
			fileWrite.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void MyFoodRead(String Id) {
		try {
			String s;
			int count = 0;
			String[] array;
			BufferedReader bos = new BufferedReader(new FileReader("창작요리.txt"));
			while ((s = bos.readLine()) != null) {
				array = s.split("/");
		
				if (Id.equals(array[0])) {
					System.out.println(array[1] + " "+ array[2] + " " + array[3] + " " + array[4]);
					count++;
				}
			}

			if (count == 0) {
				System.out.println("찜한 목록이 없습니다.");
			}
			
			bos.close();
		} catch (IOException E10) {
			E10.printStackTrace();
		}
	}
}

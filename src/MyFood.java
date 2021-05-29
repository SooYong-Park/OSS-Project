import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFood {
	static String createPath = "./create.txt";
	static String cigdetPath = "./createigdet.txt";
	static String crcpDcPath = "./creatercpdc.txt";
	

   public void MyFoodWrite() {                              // 창작요리 쓰기
      String FoodNum = String.valueOf((int)(Math.random()*100)+200000);
      //String FoodName = get;
      //String FoodIntroduce = get;
      //String Level = get;

      try {                                                
         File file = new File(createPath);         // 기본정보 저장
         FileWriter fileWrite = new FileWriter(file, true);

         String s = (FoodNum + "/" + FoodName + "/" + FoodIntroduce + "/" + Level);
         fileWrite.write(s + "\r\n");
         fileWrite.flush();
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }

      //int count = get;
      //String FoodRecipe = scn.nextLine();
      //String RecipeCount = scn.nextLine();
      try {
         File file = new File(cigdetPath);         // 재료정보 저장
         FileWriter fileWrite = new FileWriter(file, true);
         for (int i = 0; i < count; i++) {
            String s = (FoodNum + "/" + FoodRecipe + "/" + RecipeCount);
            fileWrite.write(s + "\r\n");
            fileWrite.flush();

         }
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }

      //int count2 = get;
      //String FoodMake = scn.nextLine();                                                
      try {
         File file = new File(crcpDcPath);         // 과정정보 저장
         FileWriter fileWrite = new FileWriter(file, true);
         for (int i = 0; i < count2; i++) {
            String s = (FoodNum + "/" + i+1 + "/" + FoodMake);
            fileWrite.write(s + "\r\n");
            fileWrite.flush();

         }
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void MyFoodWrite2() {                  // 찜한 요리 저장(형식 논의)
      Scanner scn = new Scanner(System.in);
      String Id;
      String FoodNum = scn.nextLine();
      String FoodName = scn.nextLine();
      String FoodIntroduce = scn.nextLine();
      String Level = scn.nextLine();

      try {
         File file = new File("C:\\Users\\sms14\\eclipse-workspace\\Food\\찜한요리.txt");
         FileWriter fileWrite = new FileWriter(file, true);

         String s = (FoodNum + "/" + FoodName + "/" + FoodIntroduce + "/" + Level);
         fileWrite.write(s + "\r\n");
         fileWrite.flush();
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void MyFoodRead(String Id) {         // 찜한 요리 읽기
      try {
         String s;
         int count = 0;
         String[] array;
         BufferedReader bos = new BufferedReader(new FileReader("찜한요리.txt"));
         while ((s = bos.readLine()) != null) {
            array = s.split("/");

            if (Id.equals(array[0])) {
               System.out.println(array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
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
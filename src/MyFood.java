import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFood {
   static String createPath = "./create.txt";
   static String cigdetPath = "./createigdet.txt";
   static String crcpDcPath = "./creatercpdc.txt";
   static String FoodName;
   static String FoodIntroduce;
   static String Level;
   static String RecipeName[] = new String [20];
   static String RecipeAmount[] = new String [20];
   static String RecipeProcess[] = new String [10];
   static int d;
   static int g;
   static int count1 = 0, count2 = -1;
   public void getName(String a, String b, String c) {
	   this.FoodName = a;
	   this.FoodIntroduce = b;
	   this.Level = c;
   }
   public void getRecipe(int d, String[] e, String [] f) {
	   for(int i = 0; i < d; i++) {
		   this.d = d;
		   this.RecipeName[i] = e[i];
		   this.RecipeAmount[i] = f[i];
	   }
   }
   public void getProcess(int g, String[] h) {
	   for(int i = 0; i < g; i++) {
		   this.g = g;
		   this.RecipeProcess[i] = h[i];
	   }
   }
   public void MyFoodWrite() {                              // 창작요리 쓰기
      String FoodNum = String.valueOf((int)(Math.random()*100)+200000);
      
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

      try {
         File file = new File(cigdetPath);         // 재료정보 저장
         FileWriter fileWrite = new FileWriter(file, true);
         for (int i = 0; i < d; i++) {
            String s = (FoodNum + "/" + RecipeName[i] + "/" + RecipeAmount[i]);
            fileWrite.write(s + "\r\n");
            fileWrite.flush();

         }
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
                                              
      try {
         File file = new File(crcpDcPath);         // 과정정보 저장
         FileWriter fileWrite = new FileWriter(file, true);
         
         for (int i = 0; i < g; i++) {
            String s = (FoodNum + "/" + i+1 + "/" + RecipeProcess[i]);
            fileWrite.write(s + "\r\n");
            fileWrite.flush();

         }
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
/*
   public static void MyFoodWrite2() {                  // 찜한 요리 저장(형식 논의)
      Scanner scn = new Scanner(System.in);
      String Id = null;
      String FoodNum = scn.nextLine();
      String FoodName = scn.nextLine();
      String FoodIntroduce = scn.nextLine();
      String Level = scn.nextLine();
      String Recipe = ;
      String FoodMake = ;
      
      try {
         File file = new File("C:\\Users\\sms14\\eclipse-workspace\\Food\\찜한요리.txt");
         FileWriter fileWrite = new FileWriter(file, true);

         String s = (Id + "/" + FoodName + "/" + FoodIntroduce + "/" + Level + "/" + Recipe + "/" + FoodMake);
         fileWrite.write(s + "\r\n");
         fileWrite.flush();
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   */
   public static void MyFoodRead(String Id) {         // 찜한 요리 읽기
      try {
         String s;
         String[] array;
         String[] array2 = null;
         String[][] array3 = null ;
         BufferedReader bos = new BufferedReader(new FileReader("찜한요리.txt"));
         while ((s = bos.readLine()) != null) {
            array = s.split("/");

            if (Id.equals(array[0])) {
               System.out.println(array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
               array2 = array[5].split(">");
               count1++;
               count2++;
            
               for(int i = 0; i < array2.length; i++ ) {
            	   array3[count2][i] = array2[i];
               }
            }
         }
         System.out.println(array3[0][0]);
         for(int i = 0; i < count2+1; i++ ) {
         	for(int j=0; j < array3[i].length; j++)
        	 System.out.println(array3[i][j]);
         }
         if (count1 == 0) {
            System.out.println("찜한 목록이 없습니다.");
         }

         bos.close();
      } catch (IOException E10) {
         E10.printStackTrace();
      }
   }
}
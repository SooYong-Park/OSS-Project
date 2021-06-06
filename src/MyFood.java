import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
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
   static String Id1 = null;
   public void getName(String a, String b, String c) {
	   this.FoodName = a;
	   this.FoodIntroduce = b;
	   this.Level = c;
   }
   public void getRecipe(int d, String[] e, String [] f) {
	   this.d = d;
	   for(int i = 0; i < this.d; i++) {
		   
		   this.RecipeName[i] = e[i];
		   this.RecipeAmount[i] = f[i];
	   }
   }
   public void getProcess(int g, String[] h) {
	   this.g = g;
	   for(int i = 0; i < this.g; i++) {
		   
		   this.RecipeProcess[i] = h[i];
	   }
   }
   public void MyFoodWrite() {                              // 창작요리 쓰기
      String FoodNum = String.valueOf((int)(Math.random()*100)+200000);
      
      try {                                                
         File file = new File(createPath);         // 기본정보 저장
         FileWriter fileWrite = new FileWriter(file, true);

         String s = (FoodNum + "#" + FoodName + "#" + FoodIntroduce + "#" + Level);
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
            String s = (FoodNum + "#" + RecipeName[i] + "#" + RecipeAmount[i]);
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
            String s = (FoodNum + "#" + i+1 + "#" + RecipeProcess[i]);
            fileWrite.write(s + "\r\n");
            fileWrite.flush();

         }
         fileWrite.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void MyFoodWrite2(String FoodName, String FoodIntroduce, String Level, String Recipe, String FoodMake) {                  // 찜한 요리 저장(형식 논의)
      String Id = Id1;
      
      try {
    	  BufferedWriter bw = null;
    	  FileOutputStream output1=new FileOutputStream("./찜한요리.txt", true);
          OutputStreamWriter writer1=new OutputStreamWriter(output1, Charset.forName("EUC-KR"));
          bw = new BufferedWriter(writer1);
          String s = (Id + "#" + FoodName + "#" + FoodIntroduce + "#" + Level + "#" + Recipe + "#" + FoodMake);
         bw.write(s);
         bw.write("\n");

         bw.flush();
         bw.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   public static void MyFoodRead(String Id, String p[], String q[], String r[], String s[], String t[][]) { // 찜한 요리 읽기
	      try {
	         String s1;
	         String name[] = new String[10];
	         String[] array;
	         String[] array2 = null;
	         BufferedReader bos = new BufferedReader(new FileReader("./찜한요리.txt"));
	         while ((s1 = bos.readLine()) != null) {
	            array = s1.split("#");

	            if (Id.equals(array[0])) {
	               p[count1] = array[1];
	               q[count1] = array[2];
	               r[count1] = array[3];
	               s[count1] = array[4];
	               array2 = array[5].split(">");
	               count1++;
	               count2++;

	               for (int i = 0; i < array2.length; i++) {
	                  t[count2][i] = array2[i];
	               }
	            }
	         }

	         if (count1 == 0) {
	            p[0] = "찜한 목록이 없습니다.";
	         }

	         bos.close();
	      } catch (IOException E10) {
	         E10.printStackTrace();
	      }
	   }
   public void getId(String a) {
		Id1 = a;
	}
}
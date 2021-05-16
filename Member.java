import java.io.*;
import java.util.*;

public class Member {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String Id = scn.nextLine();
		String Password = scn.next();
		String a[][]  = new String[20][4];
		int i = 0, j = 0;
		try{	
		FileReader fileStream = new FileReader("c:/MyTemp/MemberList.txt");
		BufferedReader bufReader = new BufferedReader(fileStream);
		String line;
	
		while((line = bufReader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
			a[i][j] = st.nextToken();
			j++;
			if(j==4) {
				i++;
				j = 0;
			}
			}
		}
		bufReader.close();
		}catch (Exception e) {
			e.getStackTrace();
		}
		j = 0;
		for(i = 0; i < 20; i++) {
			if(Id.equals(a[i][0]) && Password.equals(a[i][1])) {
				System.out.println("로그인 성공");
			}
			else {
			j++;
			}
			if(j == 20){
				System.out.println("로그인 오류");
				break;
			}
		}
	}
	/*
	public void payment() {
		try {
			File file = new File("C:\\MyTemp\\ReceptionList.txt");
			FileWriter fileWrite = new FileWriter(file,true);
			
			String s = (Id + " " + in + " " + out + " " + type + " " + total + " " + area);
			fileWrite.write(s + "\r\n");
			fileWrite.flush();
			fileWrite.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
}

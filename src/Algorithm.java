import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public void Algorithm(List<Integer> array) {
       
            String [] arr3 = new String [1000];
            int [] arr2 = new int [500000];
            for(int i = 0 ; i < array.size(); i++){         
               for(int j = 0; j < array.size(); j++) {
                  if(array.get(i).equals(array.get(j))) {                  // 배열에 중복되는 것이 있으면 해당하는 숫자를 인덱스로 갖는 배열의 숫자 증가
                      arr2[Integer.valueOf(array.get(i))] ++; 
                  }
               }
            }
            
            int a = 0;
            
            for(int i = 0 ; i < arr2.length; i++){         // 중복되는 것이 5개일 경우
                if(arr2[i] > 24) {
                      arr3[a] = String.valueOf(i);
                      a++;
                   }
             }
            
            for(int i = 0 ; i < arr2.length; i++){         // 중복되는 것이 4개일 경우
                if(arr2[i] > 15 && arr2[i] < 24) {
                      arr3[a] = String.valueOf(i);
                      a++;
                   }
             }
            
            for(int i = 0 ; i < arr2.length; i++){         // 중복되는 것이 3개일 경우
               if(arr2[i] > 8 && arr2[i] < 15) {
                     arr3[a] = String.valueOf(i);
                     a++;
                  }
            }
            for(int i = 0 ; i < arr2.length; i++){         // 중복되는 것이 2개일 경우
               if(arr2[i] > 1 && arr2[i] < 7) {
                     arr3[a] = String.valueOf(i);
                     a++;
                  }
            }
            for(int i = 0 ; i < arr2.length; i++){         // 중복되는 것이 1개일 경우
               if(arr2[i] > 0) {
                     arr3[a] = String.valueOf(i);
                     a++;
                  }
            }
            List<String> arr4 = new ArrayList<String>();
            for(int i = 0 ; i<arr3.length ; i++) {
         	   if(arr3[i] != null) {
         		   arr4.add(arr3[i]);
         	   }
            }
           
            
            System.out.println("알고리즘 적용 후 : " + Arrays.toString(arr3));
            Recipe t = new Recipe();
            t.print(arr4);
            
         
    }
}

 
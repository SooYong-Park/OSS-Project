import java.util.Arrays;
 
class Test
{
    public static void main(String args[]) {
    	
            String [] arr = {"1","2","3","1","3","3","2","1"};
            String [] arr3 = new String [10];
            int [] arr2 = new int [500];
            for(int i = 0 ; i < arr.length; i++){			
            	for(int j = 0; j < arr.length; j++) {
            		if(arr[i] == arr[j]) {						// 배열에 중복되는 것이 있으면 해당하는 숫자를 인덱스로 갖는 배열의 숫자 증가
            			arr2[Integer.parseInt(arr[i])] ++; 
            		}
            	}
            }
            
            int a = 0;
            for(int i = 0 ; i < arr2.length; i++){			// 중복되는 것이 3개일 경우
            	if(arr2[i] > 8 ) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
            for(int i = 0 ; i < arr2.length; i++){			// 중복되는 것이 2개일 경우
            	if(arr2[i] > 1 && arr2[i] < 7) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
            for(int i = 0 ; i < arr2.length; i++){			// 중복되는 것이 1개일 경우
            	if(arr2[i] > 0 && arr2[i] < 1.5) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
           
            System.out.println(Arrays.toString(arr3));
         
        }
   }

 
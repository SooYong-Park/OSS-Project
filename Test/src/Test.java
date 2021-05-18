import java.util.Arrays;
 
class Test
{
    public static void main(String args[]) {
    	
            String [] arr = {"57", "5", "57", "59", "57", "59", "58", "5"};
            String [] arr3 = new String [10];
            int [] arr2 = new int [300];
            for(int i = 0 ; i < arr.length; i++){
            	for(int j = 1; j < arr.length; j++) {
            		if(arr[i] == arr[j]) {
            			arr2[Integer.parseInt(arr[i])] ++; 
            		}
            	}
            }
            int a = 0;
            for(int i = 0 ; i < arr2.length; i++){
            	if(arr2[i] > 2 ) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
            for(int i = 0 ; i < arr2.length; i++){
            	if(arr2[i] > 1 && arr2[i] <2.5) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
            for(int i = 0 ; i < arr2.length; i++){
            	if(arr2[i] > 0 && arr2[i] < 1.5) {
            			arr3[a] = String.valueOf(i);
            			a++;
            		}
            }
           
            System.out.println(Arrays.toString(arr3));
         
        }
   }

 
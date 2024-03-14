import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
    String message = "aaaabbaabbbaabbbaaa";
    encode(message);
    }
	public static String encode(String message) {
        String encodeMsg = "";
        System.out.println("Message Length:  "+message.length());
        // int[] count = new int[500];
        int count =0;
        int j=0;
        for(int i = 0;i<message.length();i=j){
        count=0;
        System.out.println("------------------------");
        System.out.println("i ="+i);
        System.out.println("Current element: "+message.charAt(i));

        // if(message.charAt(i) == message.charAt(i)){
            for( j=i;j<message.length();j++){
                System.out.println("j = "+j);
                System.out.println("Compare element: "+message.charAt(j));
    
    
                    if(message.charAt(j) == message.charAt(i)){
                        System.out.println("Both are same increment the count");
                        count++;
                        continue;
                    }
                    else{
                        System.out.println("Not same so  breaking thr loop");
                        // count[i] = j;
                        break;
                    }
                }


        // }

        

        System.out.println("Final Count of "+message.charAt(i)+" : "+count);
        encodeMsg=encodeMsg+message.charAt(i)+String.valueOf(count);
        System.out.println("Encode Message: "+encodeMsg);

            
            
            }
            
        





        System.out.println("Returning: "+encodeMsg);

		return encodeMsg;
	}
}
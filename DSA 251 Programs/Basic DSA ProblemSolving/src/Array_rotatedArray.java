import java.util.ArrayList;
import java.util.Scanner;

public class Array_rotatedArray {
        public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner iscan = new Scanner(System.in);
        int l = iscan.nextInt();
        for(int s =0; s<l;s++){
            int p = iscan.nextInt();
            arr.add(p);
        }
        
        int k = iscan.nextInt();
    
        rotateArray(arr,k);

    }


    
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

    for(int i =0;i<k;i++){
        int temp = arr.get(0);
        arr.remove(0);
        arr.add(temp);
    }
    // System.out.println("After Rotation");
    // for (int p = 0; p < arr.size(); p++) {
    //     System.out.print(arr.get(p)+" ");
    // }


     return arr;   // Write your code here.
    }
}

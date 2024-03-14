import java.util.*;
import java.util.Arrays;

public class Array_secondLargest {



    public static int findSecondLargest(int n, int[] arr) {


        // Sorting array
        Arrays.sort(arr,0,n);
        // Sort using indexes otherwise you get 0's.
        // If there  elements in array and sort them  without indices  then these three elements
        //  would be after 4997 .  
        
    

        
        for (int i = 1; i < n && n > 2; i++) {
            // System.out.println("i= " + i);
            // Checking for same element
            if (arr[n - i] == arr[n - (i + 1)]) {
                // System.out.println("arr[n-i]" + arr[n - i]);
                // System.out.println("arr[n-(i+1)]" + arr[n - (i + 1)]);
                if (i < (n - 1)) {
                    // System.out.println("still elements left continuing");
                    // System.out.println("-----------------------------");
                    continue;
                } else {
                //     System.out.println("No same elements found Element:" + arr[n - (i + 1)]);
                    System.out.println(-1);
                    return -1;                    
                    
                }
            } else {
                // System.out.println("arr[n-i]" + arr[n - i]);
                // System.out.println("arr[n-(i+1)]" + arr[n - (i + 1)]);
                // System.out.println("elements got differ returning the left element");
                System.out.println(arr[n - (i + 1)]);
                return arr[n - (i + 1)];
                
            }
        }
        
        System.out.println(-1);
        return -1;


    }
}
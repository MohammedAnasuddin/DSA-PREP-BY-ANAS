package Strings;

import java.util.*;
public class Strings_beautuifulStrings {
    public static void main(String[] args) {
        // String str = "01010010101";
        // String str = "110011001100";
        // Try slving for above i/p o/p should be 6


        // String str = "110011001100";
        // String str = "110011001100";
        Scanner iscan = new Scanner(System.in);
        String str = iscan.nextLine();
        // String str = "101010000010110100";
        /*
         * 
         * Try This aprroach
         * 
         * Create 2 possible Beautifiul strings of same length of input string
         * 1. zero_one : starts with 0 and then 1 : 0101010....n
         * 2. one_zero : Starts with 1 and then 0 : 101010.....n
         * 
         * 
         * Compare each element of input string to each elemnof both strings
         * keep track where the input string and respective beautiful string does not match
         * then return the minimum of those tracked edifferences
         * 
         * Refer : H:\SKILLS\DSA\DSA 251 Programs\Basic DSA ProblemSolving\src\Strings\Beautiful Strings Approach.jpg
         * (Images in the strings folder)
         * 
         * Use the comparision method photo in phone 
         */
        makeBeautiful(str);
    }

    public static int makeBeautiful(String str) {
    
    int min_zero_one = 0,min_one_zero=0;
    
    for(int i =0; i<str.length();i++){
        System.out.println("---------------------------------");
        System.out.println("i ="+i);
        
        int current_bit = Character.getNumericValue(str.charAt(i));

        System.out.println("Current bit: "+current_bit);

        
        if(i%2==0){
        // If index is even
        
        
        if(current_bit != 0){
    
            min_zero_one++;
        }
        if(current_bit != 1){
            min_one_zero++;
        }
        
        }
        else{
        // If index is odd
        if(current_bit != 1){
            min_zero_one++;
        }
        if(current_bit != 0){
            min_one_zero++;
        }
        }


    }




    System.out.println("Minimum No. of operations: "+Math.min(min_zero_one, min_one_zero));
    
    return Math.min(min_zero_one, min_one_zero);
    }

}

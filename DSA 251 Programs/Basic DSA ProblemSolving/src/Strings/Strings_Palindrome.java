package Strings;
import java.util.*;
public class Strings_Palindrome {
    public static void main(String[] args) {
        //// System.out.println(12462799726421 - 12462788885278);

        // Odd

        // String number = "12963";
        // int length = 5;
        
        // Even
        // String number = "6499986";
        // int length = 7;
        
        
        String number = "999";
        int length = 3;


        // Scanner iscan = new Scanner(System.in);
        // // // Test case
        // int length = iscan.nextInt();
        // String number =iscan.nextLine() ;
        nextLargestPalindrome(number, length);
    }

    public static String nextLargestPalindrome(String number, int length) {
        System.out.println("String_Number: " + number);
        long new_num = Long.parseLong(number);
        new_num++;
        String increment_number = String.valueOf(new_num);

        System.out.println("String_Number after incremnt: " + increment_number);
        length = increment_number.length();
        System.out.println("String_Number_Length: " + length);
        System.out.println("Number_Nature: " + (length % 2 == 0 ? "Even" : "Odd"));

        StringBuilder palindrome_number = new StringBuilder();

        if (length == 1) {
            System.out.println("Return: " + increment_number);
            return increment_number;
        } else if (length == 2) {
            char digits[] = increment_number.toCharArray();
            if (Character.getNumericValue(digits[0]) < Character.getNumericValue(digits[1])) {
                palindrome_number.append(digits[1]);
                palindrome_number.append(digits[1]);
            } else {
                palindrome_number.append(digits[0]);
                palindrome_number.append(digits[0]);
            }
            System.out.println("Return: " + palindrome_number.toString());
            return palindrome_number.toString();
        } else {
            String real_left,real_right;

            // System.out.println("length/2: "+length/2);
            String mid="";

            if (length % 2 == 0) {
                // Even No.of Elements
                // no subtaction since substrig is inclusive at end index
                // palindrome_number = new StringBuilder(increment_number.substring(0, (length /
                // 2)));

                real_left = increment_number.substring(0, (length / 2)-1);
                mid = increment_number.substring((length / 2) - 1, (length / 2) + 1);
                real_right = increment_number.substring(((length / 2)+1), length);

                // System.out.println("Even Left: "+real_left);
                // System.out.println("Even Right: "+real_right);
                // palindrome_number.append(real_left);
                // palindrome_number.reverse();

                // if( Integer.parseInt(real_right)>Integer.parseInt(palindrome_number.reverse().toString())){
                //     System.out.println("Need to increment the left");
                //     palindrome_number.setLength(0);
                //     System.out.println("String builder resetted: "+palindrome_number.toString());
                //     real_left = String.valueOf(Integer.parseInt(real_left)+1);
                //     System.out.println("Even Left after incrementing: "+real_left);
                    
                // }
                // palindrome_number.append(real_left);
                // System.out.println("String builder after appending incremented left: "+palindrome_number.toString());
                // real_right = palindrome_number.reverse().toString();
                // palindrome_number.reverse();
                // palindrome_number.append(real_right);

            } else {

                // Odd No. of elements
                real_left = increment_number.substring(0, (length / 2));
                mid = increment_number.substring((length / 2), (length / 2) + 1);
                real_right = increment_number.substring(((length / 2) + 1), length);
                
            }
                // palindrome_number = new StringBuilder(increment_number.substring(0, (length /
                // 2) - 1));
                // -1 since 2 elemnts are mid for even
            

            System.out.println("Left of the String: " + real_left);
            System.out.println("Mid of the String: " + mid);
            System.out.println("Right of the String: " + real_right);

            palindrome_number.append(real_left);
            System.out.println("Appended left to palindrome: " + palindrome_number.toString());

            String palindrome_right = palindrome_number.reverse().toString();
            palindrome_number.reverse();
            

            // > this is not the right condition to check the right is to check whether the digits of mid are same or not
            if(
                Integer.parseInt(palindrome_right)<Integer.parseInt(real_right)){
                    // > I want to also chect for gretaer than condition
                    System.out.println(palindrome_right+" < "+real_right+" "+((Integer.valueOf(palindrome_right)) <= (Integer.valueOf(real_right))));
                    System.out.println("Incrementing the Mid");

                    //if mid length 1 increment if 2 pairing up
                    // if mid = 9 or 90,-------99 then incremt left  by 1 and call fuction again
                
                
                if(mid.length() == 1){
                    System.out.println("Mid length is 1");
                    if(Integer.parseInt(mid)<9){
                        System.out.println("Mid: "+mid+" is < 9 just increment ");
                        mid = String.valueOf(Integer.parseInt(mid)+1);
                        System.out.println("New Mid: "+mid);
                    
                    }
                    else{
                        System.out.println("Mid: "+mid+" is = 9 increment left");
                        mid="0"; //9+1 = 10 ) 0 is placed 1 is carried to left
                        System.out.println("New Mid: "+mid);
                        real_left = String.valueOf(Integer.parseInt(real_left)+1);
                        System.out.println("New left: "+real_left);
                        StringBuilder string_to_pass = new StringBuilder();
                        string_to_pass.append(real_left);
                        string_to_pass.append(mid);
                        string_to_pass.append(palindrome_right);
                        System.out.println("New String to be [passed: ]"+string_to_pass.toString());
                        System.out.println("-----------------------------------------------");
                        String final_palindrome = nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        System.out.println("Immediate next Palindrome: "+final_palindrome);
                        return final_palindrome;

                    }
                }

                else{
                    if(Integer.parseInt(mid)<10){
                        mid="11";
                    }
                    else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                    mid="22";
                    // palindrome_number.append("22");
                else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                mid="33";    
                // palindrome_number.append("33");
                else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                mid="44";    
                // palindrome_number.append("44");
                else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                mid="55";    
                // palindrome_number.append("55");
                else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                mid="66";    
                    // palindrome_number.append("66");
                else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))
                // palindrome_number.append("77");
                mid="77";    
                else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))
                // palindrome_number.append("88");
                mid="88";    
                else if (((Integer.parseInt(mid)) >= 88 && (Integer.parseInt(mid)) < 99))
                // palindrome_number.append("88");
                mid="99";    
                else {
                    System.out.println("Mid:"+mid+ "is in 90 series recall the function and assign mid 00 incremt left");
                    mid="00";
                    real_left = String.valueOf(Integer.parseInt(real_left)+1);
                        System.out.println("New left: "+real_left);
                        StringBuilder string_to_pass = new StringBuilder();
                        string_to_pass.append(real_left);
                        string_to_pass.append(mid);
                        string_to_pass.append(palindrome_right);
                        System.out.println("New String to be [passed: ]"+string_to_pass.toString());
                        System.out.println("-----------------------------------------------");
                        nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        String final_palindrome = nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        System.out.println("Immediate next Palindrome: "+final_palindrome);
                        return final_palindrome;

                }

                }
                
                
                }
                if(mid.length() ==2){
                    if(mid.charAt(0)!=mid.charAt(1)){
                        System.out.println(mid+" ->Mid with 2 digits is palndrome,fixing it ");

                        if(Integer.parseInt(mid)<10){
                            mid="11";
                        }
                        else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                        mid="22";
                        
                    else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                    mid="33";    
                    
                    else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                    mid="44";    
                    
                    else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                    mid="55";    
                    
                    else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                    mid="66";    
                        
                    else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))
                    
                    mid="77";    
                    else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))
                    
                    mid="88"; 
                    
                    else 
                    mid="99";

                    }
                    System.out.println("Mid after fixing: "+ mid);

                }




                palindrome_number.append(mid);
                        System.out.println("Palindrome after mid: " + palindrome_number.toString());
            palindrome_number.append(palindrome_right);

            
        System.out.println("Next palindrome is: " + palindrome_number.toString());
        return palindrome_number.toString();
    }

    }
}

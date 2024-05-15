package Strings;
import java.util.*;
public class Strings_Palindrome {
    public static void main(String[] args) {
        //// System.out.println(12462799726421 - 12462788885278);

        // Odd

        // String number = "12963";
        // int length = 5;
        
        // Even
        String number = "120963";
        int length = 6;
        



        // Scanner iscan = new Scanner(System.in);
        // // // Test case
        // int length = iscan.nextInt();
        // String number =iscan.nextLine() ;
        // nextLargestPalindrome(number, length);
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
            String real_left, mid, real_right;

            // System.out.println("length/2: "+length/2);

            if (length % 2 == 0) {
                // Even No.of Elements
                // no subtaction since substrig is inclusive at end index
                // palindrome_number = new StringBuilder(increment_number.substring(0, (length /
                // 2)));

                real_left = increment_number.substring(0, (length / 2) - 1);
                mid = increment_number.substring((length / 2) - 1, (length / 2) + 1);
                real_right = increment_number.substring(((length / 2) + 1), length);

            } else {
                // Odd No. of elements
                real_left = increment_number.substring(0, (length / 2));
                mid = increment_number.substring((length / 2), (length / 2) + 1);
                real_right = increment_number.substring(((length / 2) + 1), length);

                // palindrome_number = new StringBuilder(increment_number.substring(0, (length /
                // 2) - 1));
                // -1 since 2 elemnts are mid for even
            }

            System.out.println("Left of the String: " + real_left);
            System.out.println("Mid of the String: " + mid);
            System.out.println("Right of the String: " + real_right);

            palindrome_number.append(real_left);
            System.out.println("Appended left to palindrome: " + palindrome_number.toString());

            String palindrome_right = palindrome_number.reverse().toString();
            palindrome_number.reverse();

            // System.out.println("Builder before palindrome_Right:" +
            // palindrome_number.toString());
            // // palindrome_Right
            // String palindrome_right = palindrome_number.reverse().toString();
            // palindrome_number.reverse(); // So as to get left in correct oder becaiused
            // reversed for palindrome_right
            // System.out.println("palindrome_Right: " + palindrome_right);
            // System.out.println("Builder afer palindrome_Right:" +
            // palindrome_number.toString());

            // // Mid
            // // String mid;

            // if (length % 2 != 0) {
            // mid = increment_number.substring((length / 2), (length / 2)+1);
            // System.out.println("Mid odd :" + mid);
            // // Only one elmet a mid for odd
            // } else {
            // mid = increment_number.substring((length / 2) - 1, (length / 2) + 1);
            // System.out.println("Mid odd :" + mid);

            // // 2 elements for even
            // }

            System.out.println(palindrome_right+" <= "+real_right+" "+((Integer.valueOf(palindrome_right)) <= (Integer.valueOf(real_right))));
            
            char mid_digits[] = mid.toCharArray();


            if ((Integer.parseInt(palindrome_right)) <= (Integer.parseInt(real_right))) {

                if (mid.length() == 1 && (Integer.parseInt(mid)) < 9) {
                    int mid_digit = Integer.parseInt(mid);
                    mid_digit++;
                    palindrome_number.append(String.valueOf(mid_digit));
                } else {

                    if (((Integer.parseInt(mid)) >= 01 && (Integer.parseInt(mid)) < 11))
                        palindrome_number.append("11");
                    else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                        palindrome_number.append("22");
                    else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                        palindrome_number.append("33");
                    else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                        palindrome_number.append("44");
                    else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                        palindrome_number.append("55");
                    else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                        palindrome_number.append("66");
                    else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))
                        palindrome_number.append("77");
                    else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))
                        palindrome_number.append("88");
                    else {
                        palindrome_number.append("99");
                    }

                }

            }

            else {
                if(mid.length()==2 && mid_digits[0] != mid_digits[1]){
                // The values whose right plaindrome is greater than palindrome real_right but mid does not palindrome
                if (((Integer.parseInt(mid)) >= 01 && (Integer.parseInt(mid)) < 11))
                        palindrome_number.append("11");
                    else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                        palindrome_number.append("22");
                    else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                        palindrome_number.append("33");
                    else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                        palindrome_number.append("44");
                    else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                        palindrome_number.append("55");
                    else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                        palindrome_number.append("66");
                    else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))
                        palindrome_number.append("77");
                    else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))
                        palindrome_number.append("88");
                    else {
                        palindrome_number.append("99");
                    }

                }
                else{

                    palindrome_number.append(mid);

                }


            }

            System.out.println("Palindrome after mid: " + palindrome_number.toString());

            palindrome_number.append(palindrome_right);

            System.out.println("String with palindrome_right: " + palindrome_number.toString());

            return palindrome_number.toString();
        }

    }
}

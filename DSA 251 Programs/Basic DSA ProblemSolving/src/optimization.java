public class optimization {
    public static void main(String[] args) {

        String number = "12462788885278";
        int length = 14;

        nextLargestPalindrome(number, length);

    }

    public static String nextLargestPalindrome(String number, int length) {

        long new_num = Long.parseLong(number);
        new_num++;
        number = String.valueOf(new_num);

        length = number.length();

        StringBuilder palindrome_number = new StringBuilder();

        if (length == 1) {

            return number;
        } else if (length == 2) {
            char digits[] = number.toCharArray();
            if (Character.getNumericValue(digits[0]) < Character.getNumericValue(digits[1])) {
                palindrome_number.append(digits[1]);
                palindrome_number.append(digits[1]);
            } else {
                palindrome_number.append(digits[0]);
                palindrome_number.append(digits[0]);
            }

            return palindrome_number.toString();
        } else {
            String real_left, mid, real_right;

            // System.out.println("length/2: " + length / 2);

            if (length % 2 == 0) {
                real_left = number.substring(0, (length / 2));
                // mid = increment_number.substring((length / 2) - 1, (length / 2) + 1);
                real_right = number.substring(((length / 2)), length);

                // System.out.println("Even Left: "+real_left);
                // System.out.println("Even Right: "+real_right);
                palindrome_number.append(real_left);
                palindrome_number.reverse();

                if( Integer.parseInt(real_right)>Integer.parseInt(palindrome_number.reverse().toString())){
                    // System.out.println("Need to increment the left");
                    palindrome_number.setLength(0);
                    // System.out.println("String builder resetted: "+palindrome_number.toString());
                    real_left = String.valueOf(Integer.parseInt(real_left)+1);
                    // System.out.println("Even Left after incrementing: "+real_left);
                    
                }
                palindrome_number.append(real_left);
                // System.out.println("String builder after appending incremented left: "+palindrome_number.toString());
                real_right = palindrome_number.reverse().toString();
                palindrome_number.reverse();
                palindrome_number.append(real_right);


            } else {

                real_left = number.substring(0, (length / 2));
                mid = number.substring((length / 2), (length / 2) + 1);
                real_right = number.substring(((length / 2) + 1), length);

                
                palindrome_number.append(real_left);

            String palindrome_right = palindrome_number.reverse().toString();
            palindrome_number.reverse();

            if (Integer.parseInt(palindrome_right) < Integer.parseInt(real_right)) {

                if (mid.length() == 1) {

                    if (Integer.parseInt(mid) < 9) {

                        mid = String.valueOf(Integer.parseInt(mid) + 1);

                    } else {

                        mid = "0";

                        real_left = String.valueOf(Integer.parseInt(real_left) + 1);

                        palindrome_number.setLength(0);
                        palindrome_number.append(real_left);
                        palindrome_number.append(mid);
                        palindrome_number.append(palindrome_right);

                        number = nextLargestPalindrome(palindrome_number.toString(),
                                palindrome_number.toString().length());
                        return number;

                    }
                }

                else {
                    if (Integer.parseInt(mid) < 10) {
                        mid = "11";
                    } else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                        mid = "22";

                    else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                        mid = "33";

                    else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                        mid = "44";

                    else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                        mid = "55";

                    else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                        mid = "66";

                    else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))

                        mid = "77";
                    else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))

                        mid = "88";
                    else if (((Integer.parseInt(mid)) >= 88 && (Integer.parseInt(mid)) < 99))

                        mid = "99";
                    else {

                        mid = "00";
                        real_left = String.valueOf(Integer.parseInt(real_left) + 1);

                        palindrome_number.setLength(0);
                        palindrome_number.append(real_left);
                        palindrome_number.append(mid);
                        palindrome_number.append(palindrome_right);

                        number = nextLargestPalindrome(palindrome_number.toString(),
                                palindrome_number.toString().length());
                        return number;

                    }

                }

            }

            if (mid.length() == 2) {
                if (mid.charAt(0) != mid.charAt(1)) {

                    if (Integer.parseInt(mid) < 10) {
                        mid = "11";
                    } else if (((Integer.parseInt(mid)) >= 11 && (Integer.parseInt(mid)) < 22))
                        mid = "22";

                    else if (((Integer.parseInt(mid)) >= 22 && (Integer.parseInt(mid)) < 33))
                        mid = "33";

                    else if (((Integer.parseInt(mid)) >= 33 && (Integer.parseInt(mid)) < 44))
                    mid = "44";
                    
                    else if (((Integer.parseInt(mid)) >= 44 && (Integer.parseInt(mid)) < 55))
                        mid = "55";

                    else if (((Integer.parseInt(mid)) >= 55 && (Integer.parseInt(mid)) < 66))
                        mid = "66";

                    else if (((Integer.parseInt(mid)) >= 66 && (Integer.parseInt(mid)) < 77))

                        mid = "77";
                    else if (((Integer.parseInt(mid)) >= 77 && (Integer.parseInt(mid)) < 88))

                        mid = "88";

                    else
                        mid = "99";

                }
                ;

            }

            palindrome_number.append(mid);

            palindrome_number.append(palindrome_right);

            
        }
        System.out.println("Next Palindrome: " + palindrome_number.toString());
            return palindrome_number.toString();
        }

    }
}

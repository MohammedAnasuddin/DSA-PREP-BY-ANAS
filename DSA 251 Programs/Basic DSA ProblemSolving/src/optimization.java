import java.math.BigInteger;

public class optimization {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String number = "66842802474";

        int length = 11;

        nextLargestPalindrome(number, length);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Runtime: " + executionTime + "ms");

    }

    public static String nextLargestPalindrome(String number, int length) {
        System.out.println("String_Number: " + number);
        BigInteger big_num = new BigInteger(number);
        big_num = big_num.add(BigInteger.ONE);

        number = big_num.toString();

        System.out.println("String_Number after incremnt: " + number);
        length = number.length();
        System.out.println("String_Number_Length: " + length);
        System.out.println("Number_Nature: " + (length % 2 == 0 ? "Even" : "Odd"));

        StringBuilder palindrome_number = new StringBuilder();

        if (length == 1) {
            System.out.println("Return: " + number);
            return number;
        } else if (length == 2) {
            if (

            Integer.parseInt(number.substring(0, 1)) < Integer.parseInt(number.substring(length - 1))

            ) {
                palindrome_number.append(number.substring(length - 1));
                palindrome_number.append(number.substring(length - 1));
            } else {
                palindrome_number.append(number.substring(0, 1));
                palindrome_number.append(number.substring(0, 1));
            }
            System.out.println("Return: " + palindrome_number.toString());
            return palindrome_number.toString();
        } else {
            String real_left, real_right;

            String mid = "";

            if (length % 2 == 0) {

                real_left = number.substring(0, (length / 2) - 1);
                mid = number.substring((length / 2) - 1, (length / 2) + 1);
                real_right = number.substring(((length / 2) + 1), length);

            } else {

                real_left = number.substring(0, (length / 2));
                mid = number.substring((length / 2), (length / 2) + 1);
                real_right = number.substring(((length / 2) + 1), length);

            }

            System.out.println("Left of the String: " + real_left);
            System.out.println("Mid of the String: " + mid);
            System.out.println("Right of the String: " + real_right);

            palindrome_number.append(real_left);
            System.out.println("Appended left to palindrome: " + palindrome_number.toString());

            String palindrome_right = palindrome_number.reverse().toString();
            palindrome_number.reverse();

            BigInteger big_palindrome_right = new BigInteger(palindrome_right);
            BigInteger big_real_right = new BigInteger(real_right);

            boolean mid_increment = false;
            boolean mid_increment_again = false;

            if (

            big_palindrome_right.compareTo(big_real_right) < 0) {

                System.out.println(palindrome_right + " < " + real_right + " "
                        + ((Integer.valueOf(palindrome_right)) <= (Integer.valueOf(real_right))));
                System.out.println("Incrementing the Mid");
                mid_increment = true;
            }

            if (mid.length() == 1 && mid_increment) {
                System.out.println("Mid length is 1");
                if (Long.parseLong(mid) < 9) {
                    System.out.println("Mid: " + mid + " is < 9 just increment ");
                    mid = String.valueOf(Long.parseLong(mid) + 1);
                    System.out.println("New Mid: " + mid);

                } else {
                    mid_increment_again = true;

                }
            }

            if ((mid.length() == 2) && (mid_increment || (mid.charAt(0) != mid.charAt(1)))

            ) {
                if (Long.parseLong(mid) < 10) {
                    mid = "11";
                } else if (((Long.parseLong(mid)) >= 11 && (Long.parseLong(mid)) < 22))
                    mid = "22";

                else if (((Long.parseLong(mid)) >= 22 && (Long.parseLong(mid)) < 33))
                    mid = "33";

                else if (((Long.parseLong(mid)) >= 33 && (Long.parseLong(mid)) < 44))
                    mid = "44";

                else if (((Long.parseLong(mid)) >= 44 && (Long.parseLong(mid)) < 55))
                    mid = "55";

                else if (((Long.parseLong(mid)) >= 55 && (Long.parseLong(mid)) < 66))
                    mid = "66";

                else if (((Long.parseLong(mid)) >= 66 && (Long.parseLong(mid)) < 77))

                    mid = "77";
                else if (((Long.parseLong(mid)) >= 77 && (Long.parseLong(mid)) < 88))

                    mid = "88";
                else if (((Long.parseLong(mid)) >= 88 && (Long.parseLong(mid)) < 99))

                    mid = "99";
                else {
                    mid_increment_again = true;

                }

            }
            if (mid_increment_again) {
                if (mid.length() == 1) {
                    mid = "0";
                } else {
                    mid = "00";
                }

                real_left = String.valueOf(Long.parseLong(real_left) + 1);
                System.out.println("New left: " + real_left);

                palindrome_number.setLength(0);
                System.out.println("palindrome_number after setig to 0: " + palindrome_number.toString());
                palindrome_number.append(real_left);
                real_right = palindrome_number.reverse().toString();
                palindrome_number.reverse();
                palindrome_number.append(mid);
                System.out.println("StrinBuilder after left incremnt and ) from mid: " + palindrome_number.toString());
                palindrome_number.append(real_right);

                System.out.println("Next palindrome is: " + palindrome_number.toString());
                return palindrome_number.toString();
            }

            palindrome_number.append(mid);
            System.out.println("Palindrome after mid: " + palindrome_number.toString());
            palindrome_number.append(palindrome_right);

            System.out.println("Next palindrome is: " + palindrome_number.toString());
            return palindrome_number.toString();
        }

    }
}

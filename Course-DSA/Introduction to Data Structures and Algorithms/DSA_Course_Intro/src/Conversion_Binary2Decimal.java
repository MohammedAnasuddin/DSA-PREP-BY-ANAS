public class Conversion_Binary2Decimal {
    public static void main(String[] args) {

        // If binary input as String

        String binary = "1010"; // 10
        double decimal = 0;
        double index = 0;
        System.out.print("Decimal of " + binary + " is");

        for (int i = (binary.length() - 1); i >= 0; i--, index++) {

        if (Integer.valueOf(binary.charAt(i)) == '1') {
        decimal = decimal + (int)Math.pow(2, index);
        }

        }

        System.out.println(decimal);




        // If binary taken as integer then

        // int binary = 1011;
        // int decimal = 0;
        // int index = 0;
        // System.out.print("Decimal of " + binary + " is: ");

        // while (binary > 0) {
        //     int lastDigit = binary % 10;
        //     if (lastDigit == 1) {
        //         decimal = decimal + (int) Math.pow(2, index);
        //     }
        //     index++;
        //     binary = binary / 10; // /10:Removes the last digit

        // }

        // System.out.println(decimal);

    }
}
public class Conversion_Decimal2Binary {
    public static void main(String[] args) {
        int decimal=10;
        String binary="";
        System.out.print("Binary of "+decimal+" is: ");

        while(decimal>0){
            binary = binary+(decimal&1);
            decimal = decimal>>1;
        }
        System.out.println(binary);
    }
}
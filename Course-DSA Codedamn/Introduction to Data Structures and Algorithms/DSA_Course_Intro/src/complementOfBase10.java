// public class complementOfBase10 {
//     public static void main(String[] args) {
//         int num=13;
// int ones_length=0;
// int ones_value=0;
// int n=num;
// 	    while(n>0){n=n>>1;
// ones_length++;
// }
// System.out.println("No .Of ones nede: "+ones_length);
// for(int i=0;i<ones_length;i++){
// ones_value =ones_value+(int)Math.pow(2,i);
// }

// System.out.println("ones_value: "+ones_value);
// 		System.out.println("Flipped bit value:"+(num^ones_value) );
//     }
// }


public class complementOfBase10 {
	public static void main(String[] args) {
		int num = 5;
		int n = num;
		int mask=0;
	
		while(n>0){

			mask = mask<<1; // Adding 0 to last digit
            mask = mask|1; // Adding 1 bit to last digit

			n=n>>1;


        }
        System.out.println("Mask : "+mask);
		System.out.println("Flip Bit: "+(num ^ mask));


	}
}
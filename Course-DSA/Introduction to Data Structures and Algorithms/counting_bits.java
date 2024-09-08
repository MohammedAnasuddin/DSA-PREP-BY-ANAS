public class counting_bits {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int[] count_array = new int[n+1];

        count_array[0] =0;

    for(int i = 1;i<=n;i++){
        System.out.println("Current number: "+n);
        int one_count=0;
        while(i>0){
            if((i&1) == 1){
                one_count++;
                System.out.println("Current one_count: "+one_count);
            }
            n=n>>1;
            
        }
        sum = sum+one_count;
        count_array[i] = one_count;
        System.out.println("Current array element: "+count_array[i]);

    }
    System.out.print("[ ");
    for(int i =0;i<=(n+1);n++)
    System.out.print(count_array[i]+",");



    System.out.print(" ]");

    System.out.println("Modulo :"+sum%1000000007);
    }
}
public class counting_bits {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int[] count_array = new int[n + 1];

        count_array[0] = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("-------------------------");
            int cn = i;
            System.out.println("Current number: " + cn);
            int one_count = 0;
            int temp=0;
            while (cn != 0) {
                if ((cn & 1) == 1) {
                    one_count++;
                    System.out.println("Current one_count: " + one_count);
                }
            
                cn = cn >> 1;
                temp++;
                System.out.println(temp+"."+" i after right shift:" + cn);


            }
            sum = sum + one_count;
            count_array[i] = one_count;
            // System.out.println("Current array element: " + count_array[i]);

        }
        System.out.print("[ ");
        for (int i = 0; i <= (n); i++)
            System.out.print(count_array[i] + ",");

        System.out.print(" ]");
        System.out.println();
        System.out.println("Modulo :" + sum % 1000000007);
    }
}
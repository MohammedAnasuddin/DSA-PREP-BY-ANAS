import java.util.*;


public class Array_equilibriumIndex {
    public static void main(String[] args) {
        int tc = 0;
        Scanner iscan = new Scanner(System.in);
        tc = iscan.nextInt();

        for (int c = 1; c <= tc; c++) {
            int n = 0;
            n = iscan.nextInt();
            int[] ARR = new int[n];

            // Reading Inputs
            for (int i = 0; i < n; i++) {

                ARR[i] = iscan.nextInt();
            }

            arrayEquilibriumIndex(ARR);

        }

    }

    public static int arrayEquilibriumIndex(int[] arr) {
        int iterable_sum = 0, remaing_sum = 0;
        int total_sum = Arrays.stream(arr).sum();
        if (arr.length > 2 && arr.length <= 100000) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("--------------------------------------");
                System.out.println("i =" + i);
                System.out.println("Element = " + arr[i]);

                iterable_sum = i == 0 ? iterable_sum += 0 : iterable_sum + arr[i - 1];

                System.out.println("Iterable sum= " + iterable_sum);
                remaing_sum = (total_sum - iterable_sum)-arr[i];
                System.out.println("remaining sum after excluding= " + remaing_sum);

                System.out.println(iterable_sum + " = " + remaing_sum);
                if (iterable_sum == remaing_sum) {
                    System.out.println("Equal Equilbrium found");
                    System.out.println(i);
                    System.out.println("Adding index " + i + " to the array");
                    return i;


                } else {
                    continue;
                }

            }

        }
        return -1;
    }
}
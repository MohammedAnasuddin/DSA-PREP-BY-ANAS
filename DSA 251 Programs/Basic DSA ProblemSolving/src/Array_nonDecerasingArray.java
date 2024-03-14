import java.util.*;
import java.io.*;

public class Array_nonDecerasingArray {
    public static void main(String[] args) {
        int tc = 0;
        Scanner iscan = new Scanner(System.in);
        tc = iscan.nextInt();

        for (int c = 1; c <= tc; c++) {
            int[] ARR = new int[10000];
            int n = 0;
            n = iscan.nextInt();

            // Reading Inputs
            for (int i = 0; i < n; i++) {

                ARR[i] = iscan.nextInt();
            }

            isPossible(ARR, n);

        }

    }

    public static boolean isPossible(int[] arr, int n) {
        int atmost = 0;

        for (int i = 0; i <= n - 2; i++) {
            System.out.println("------------------------------");
            System.out.println("i =" + i);
            System.out.println("arr[i] " + arr[i]);
            System.out.println("arr[i+1] " + arr[i + 1]);
            // System.out.println(arr[i] <=arr[i+1]);
            if (arr[i] <= arr[i + 1] && atmost <= 1) {
                // if(atmost<=1){
                // System.out.println("Good Continuing");
                // continue;
                // }

                // else{

                // System.out.println("atmost > 0 cant travese further");
                // System.out.println("Final : false");
                // return false;
                // }
                continue;
            } else {
                atmost = atmost + 1;
                if (atmost <= 1) {
                    System.out.println("First element to be changed");
                    System.out.println(i + " <= " + (arr.length - 1));

                    if ((i + 2) <= (n - 1)) {
                        // System.out.println("array has elements ahead");
                        if (arr[i] <= arr[i + 2]) {
                            System.out.println("the ahead element is greate rthan arr[i]");
                            System.out.println("hence assigning i+1 elememt as i to maintain order ");

                            // System.out.println("Assigning greater number");
                            arr[i + 1] = arr[i];
                        } else {
                            System.out.println("the ahead element is less than arr[i]");
                            System.out.println("hence assigning i elememt as i+1 to maintain order ");
                            System.out.println("Assigning Lesser no. number");
                            arr[i] = arr[i + 1];
                        }

                    } else {
                        System.out.println("this is the end th array ");

                        System.out.println("hence assigning i elememt as i+1 to maintain order ");
                        arr[i + 1] = arr[i];
                    }

                    System.out.println("After Updating atmostt element");
                    for (int p = 0; p < n; p++) {
                        System.out.print(arr[p] + " ");
                    }
                    i = -1;
                    System.out.println("Restarting loop ");
                } else {
                    System.out.println("A elemnent was alredy changed atmost is > 1");
                    System.out.println("Final: false");
                    return false;
                }

            }
        }

        if (n <= 10000 && atmost <= 1) {

            System.out.println("Final :true");
            return true;
        } else {

            System.out.println("Final false");
            return false;
        }

    }
}

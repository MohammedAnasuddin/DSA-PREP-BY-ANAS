package Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_Matrix_Zeros {
    public static void main(String[] args) {
        int[][] matrix = { { 9, 3 }, { 4, 0 }, { 4, 3 }, { 4, 0 }, { 1, 3 } };
        System.out.println("Given Matrix");
        for (int[] row : matrix) {
            System.out.print("[");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        setZeros(matrix);
    }

    public static void setZeros(int matrix[][]) {

        ArrayList<ArrayList<Integer>> zero_indexes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {

                zero_indexes.add(new ArrayList<>(Arrays.asList(i,j)));

                }
            }
        }

        System.out.println("Zero index");
        for (ArrayList<Integer> cordinate : zero_indexes) {
            System.out.print("[");
            for (int num : cordinate) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        ArrayList<Integer> cordinate = new ArrayList<>();


        for(int i = 0; i< zero_indexes.size();i++){
        cordinate = zero_indexes.get(i);
        System.out.println("Currnt Working index: "+cordinate);

        int x = cordinate.get(0);
        int y = cordinate.get(1);

        //> Making the Row Zero
        for(int row =0 ; row<matrix[x].length; row++){
            matrix[x][row]=0;
        }


        //> Making the Column Zero
        for(int column =0 ; column<matrix.length; column++){
            matrix[column][y] =0;
        }


        // int zero_row = 0;
        // int zero_column = 0;

        // for (int z = 0; z < array_index; z++) {
        //     zero_row = zero_index_array[z][0];
        //     zero_column = zero_index_array[z][1];
        //     System.out.println("****Current row: " + zero_row + " Current column: " + zero_column);

        //     for (int r = 0, c = 0; r < matrix[zero_row].length && c < matrix.length;) {
        //         System.out.println("Current r: " + r);
        //         matrix[zero_row][r] = 0;
        //         if (((r) == (matrix[zero_row].length) - 1)) {

        //             System.out.println("Current c: " + c);
        //             if (matrix[c].length > zero_column) {
        //                 matrix[c][zero_column] = 0;
        //                 c++;
        //                 continue;
        //             }
        //         }
        //         r++;
        //     }








































            System.out.println("Matrix after zeroing rows");
            for (int[] row : matrix) {
                System.out.print("[");
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.print("]");
                System.out.println();
            }

        }

    }
}


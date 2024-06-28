package Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_Matrix_Zeros {
    public static void main(String[] args) {
        int[][] matrix = { { 9,3 }, { 4, 0 } , { 4,3 },{ 4,0 },{1,3} };
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
        // ArrayList<ArrayList<Integer>> zero_indexes = new ArrayList<>();
        int[][] zero_index_array = new int[10][2];
        // int[] index = new int[2];

        int array_index=0;
        // > Row Iteration
        for (int i = 0; i < matrix.length; i++) {
            // System.out.println("Current Row: " + i);

            // > Column Iteration
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.println("Current Column: " + j);
                if (matrix[i][j] == 0) {

                    zero_index_array[array_index][0] = i;
                    zero_index_array[array_index][1] = j;
                    array_index++;

                    
                    // index[0] = i;
                    // index[1] = j;
                    // // - .add appends
                    // // - for new row use new keyword
                    // zero_indexes.add(new ArrayList<>(Arrays.asList(index[0], index[1])));
                    // int zero_row = zero_indexes.get(i).get(0);
                    // int zero_column = zero_indexes.get(i).get(1);

                }
            }
        }


        System.out.println("Zero index");
        for (int[] row : zero_index_array) {
            System.out.print("[");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.print("]");
            System.out.println();
        }

        int zero_row = 0;
        int zero_column = 0;

        for (int z = 0; z < array_index; z++) { 
             zero_row = zero_index_array[z][0];
             zero_column = zero_index_array[z][1];
            System.out.println("****Current row: " + zero_row + " Current column: " + zero_column);
            // //> Zeroing the rows
            for (int r = 0,c=0; r < matrix[zero_row].length && c < matrix.length; ) {
                System.out.println("Current r: " + r);
                matrix[zero_row][r] = 0;
                if(( (r) ==(matrix[zero_row].length)-1  )){
                    
                    System.out.println("Current c: " + c);
                    if (matrix[c].length>zero_column) {
                        matrix[c][zero_column] = 0;
                        c++;
                        continue;
                            } 
                }
                r++;
            }

            System.out.println("Matrix after zeroing rows");
            for (int[] row : matrix) {
                System.out.print("[");
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.print("]");
                System.out.println();
            }

            // > Zeroing Column
            // for (int c = 0; c < matrix.length; c++) { 
            //     if (matrix[c].length <= zero_column) {
            //         continue;
            //     } else {
            //         matrix[c][zero_column] = 0;
            //     }
            // }

            // System.out.println("Matrix after zeroing columns");
            // for (int[] row : matrix) {
            //     System.out.print("[");
            //     for (int num : row) {
            //         System.out.print(num + " ");
            //     }
            //     System.out.print("]");
            //     System.out.println();
            // }

        }

    }
}

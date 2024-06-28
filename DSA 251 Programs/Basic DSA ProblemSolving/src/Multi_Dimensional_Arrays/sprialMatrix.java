package Multi_Dimensional_Arrays;
import java.util.ArrayList;


public class sprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };
        // int[][] matrix = { {0,0} };

        // System.out.println("Given Matrix");
        for (int[] row : matrix) {
            System.out.print("[");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.print("]");
     System.out.println();
        }

        spiralPrint(matrix);
    }

    public static void spiralPrint(int matrix[][]) {

          if(matrix.length<2){
            System.out.println(" ");
        }
        else{
            int start_row = 0;
            int start_column = 0;
            int end_row = matrix.length - 1;
            int end_column = matrix[0].length - 1;

            ArrayList<Integer> spiralNumbers = new ArrayList<>();
    
            System.out.println("Matrix Intial Status:");
            System.out.println("start_row: " + start_row);
            System.out.println("end_row: " + end_row);
            System.out.println("start_column: " + start_column);
            System.out.println("end_column: " + end_column);
            System.out.println("###############################");
    
            int i = 0, j = 0;
    
            i = start_row;
            j = start_column;
            outer_loop: while (((start_row >= 0 && start_row <= end_row) && end_column < matrix[start_row].length)
                    && (i >= 0 && j < matrix.length)) {
                System.out.println("----------------------------------------");
                System.out.println("start_row: " + start_row);
                System.out.println("end_row: " + end_row);
                System.out.println("start_column: " + start_column);
                System.out.println("end_column: " + end_column);
                System.out.println("----------------------------------------");
    
                System.out.println("*******************************************");
                // >Priting Top Row
                
                System.out.println("Printing The Top Row");
                // if(j<=end_column && i<=(end_row/2)){
                    for (j = start_column; j <= end_column && i==start_row;) {
                        
                        if (j == end_column) {
                        // System.out.println("i=" + i + ",j=" + j + ": " + matrix[i][j]);
                        spiralNumbers.add(matrix[i][j]);
                        // System.out.print(matrix[i][j]+" ");
                        start_row++;
                        System.out.println("First Row Printed start_row= " + start_row);
                        break;
                    } else {
                        // System.out.println("i=" + i + ",j=" + j + ": " + matrix[i][j]);
                        spiralNumbers.add(matrix[i][j]);
                        // System.out.print(matrix[i][j]+" ");
                        j++;
                    }
                    
                }
                // }
                
                // > Printing Last Column
                System.out.println("Printing The Last Column");
                
                // if(i<=end_row){
                    for (i = start_row; i <= end_row && j==end_column;) {
                        // System.out.println("i="+i+",j="+j);
                        if (i == end_row) {
                            // System.out.println("i=" + i + ",j=" + j + ": " + matrix[i][j]);
                            spiralNumbers.add(matrix[i][j]);
                            // System.out.print(matrix[i][j]+" ");
                            end_column--;
                            System.out.println("last Column Printed end_column= " + end_column);
                            break;
                        } else {
                            // System.out.println("i=" + i + ",j=" + j + ": " + matrix[i][j]);
                            spiralNumbers.add(matrix[i][j]);
                            // System.out.print(matrix[i][j]+" ");
                            i++;
                        }
                    }
                    // }
                    //> Printing the Lastrow
                    System.out.println("Printing The Last Row");
                    for (j = end_column; j >= start_column && i==end_row;) {
                        if (j == start_column) {
                            // System.out.println("i=" + i + ",j=-" + j + ": " + matrix[i][j]);
                            spiralNumbers.add(matrix[i][j]);
                            // System.out.print(matrix[i][j]+" ");
                        end_row--;
                        break;
                    } else {
                        // System.out.println("i=" + i + ",j=!" + j + ": " + matrix[i][j]);
                        spiralNumbers.add(matrix[i][j]);
                        // System.out.print(matrix[i][j]+" ");
                        j--;
    
                    }
                }
                
                System.out.println("Printing The First Column");
                // for (i = end_row; i >= start_row && j < (end_column / 2);) {
                for (i = end_row; i >= start_row && j==start_column;) {
                    if (i == start_row) {
                        start_column++;
                        // System.out.println("i=" + i + ",j===" + j + ": " + matrix[i][j]);
                        spiralNumbers.add(matrix[i][j]);
                        // System.out.print(matrix[i][j]+" ");
                        
                    //     System.out.println("Printed the final element of round");
                    //     // if((i/2) == (matrix.length/2)-1){
                    //         // if((i==(matrix.length-1)/2)){
                    //             if(start_row==end_column){
                    //                 // System.out.println("i=" + i + ",j===" + j + ": " + matrix[i][j]);
                    //                 System.out.print(matrix[i][j]+"x ");
                    //                 // if (((start_row == matrix.length / 2) && end_column == matrix[start_row].length / 2)) 
                    //                 continue outer_loop;
                    //     } else {
                    //         System.out.println("Printed the round going for the inner one");
                    //         continue outer_loop;
    
                    //     }
                    } else {
                        // System.out.println("i=" + i + ",j=" + j + ": " + matrix[i][j]);
                        spiralNumbers.add(matrix[i][j]);
                        // System.out.print(matrix[i][j]+" ");
                        i--;
    
                    }
    
                }
    
            }

            for(int num : spiralNumbers){
                System.out.print(num+" ");
            }




        }
    }
}
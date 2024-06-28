

public class  Solution{
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
        //         { 13, 12, 11, 10, 9 } };
        int[][] matrix = { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };
        // int[][] matrix = { {0,0} };

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
    
            int i = 0, j = 0;
    
            i = start_row;
            j = start_column;
            outer_loop: while (((start_row >= 0 && start_row <= end_row) && end_column < matrix[start_row].length)
                    && (i >= 0 && j < matrix.length)) {
    
                for (j = start_column; j <= end_column && i == start_row;) {
    
                    if (j == end_column) {
    
                        System.out.print(matrix[i][j] + " ");
                        start_row++;
    
                        break;
                    } else {
    
                        System.out.print(matrix[i][j] + " ");
                        j++;
                    }
    
                }
    
                for (i = start_row; i <= end_row && j == end_column;) {
    
                    if (i == end_row) {
    
                        System.out.print(matrix[i][j] + " ");
                        end_column--;
    
                        break;
                    } else {
    
                        System.out.print(matrix[i][j] + " ");
                        i++;
                    }
                }
    
                for (j = end_column; j >= start_column && i == end_row;) {
                    if (j == start_column) {
    
                        System.out.print(matrix[i][j] + " ");
                        end_row--;
                        break;
                    } else {
    
                        System.out.print(matrix[i][j] + " ");
                        j--;
    
                    }
                }
    
                for (i = end_row; i >= start_row && j == start_column;) {
                    if (i == start_row) {
                        start_column++;
    
                        System.out.print(matrix[i][j] + " ");
    
                    } else {
    
                        System.out.print(matrix[i][j] + " ");
                        i--;
    
                    }
    
                }
    
            }




        }
    }
}
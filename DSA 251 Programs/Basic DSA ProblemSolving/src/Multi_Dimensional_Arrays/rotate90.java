package Multi_Dimensional_Arrays;

public class rotate90 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5,6 }, { 7, 8, 9 } };
        System.out.println("Given Matrix");
        for(int[] row: matrix){
            System.out.print("[");
            for(int num : row){
                System.out.print(num+" ");
            }
            System.out.print("]");
            System.out.println();
        }

        inplaceRotate(matrix, matrix.length);

        /*
            > Approach: Its 90 degrees rotation 
            > the last column becomes first row
            > to fetch row used i and last column n-1 since n is size 
            > assigned value of last column elemnt to row
            > rotatedarr[i][j] == arr[j][n]
            > j is act as samme index since row and column has same no. of elements
            - It was necessary  to store the values in another array so
            - so that original array shouldnt be modified
            > Later assign rotated array to original arraay since it was void function 
            > judge was checking values of arr rather than rotatedArr 
         */
    }

    public static void inplaceRotate(int[][] matrix, int n) {
        int[][] rotatedArray = new int[n][n];
        // m[i][j] = m[j][n] n-- , j++
        n = n-1;
      for(int i =0; i<matrix.length && n>=0 ; i++,n--){
        System.out.println("---------------------------------");
            System.out.println("Current row: "+i);
        System.out.println("Current column: "+n);

        for(int j =0 ; j<matrix.length; j++){
            System.out.println("Current j value: "+j);
            System.out.println("Current row element: "+matrix[i][j]);
            System.out.println("Current last column element: "+matrix[j][n]);
            rotatedArray[i][j] = matrix[j][n];
        }

    }


    for(int row =0;row<matrix.length;row++){
        for(int i =0 ; i<matrix.length;i++){
            matrix[row][i] = rotatedArray[row][i];
        }
    }



    for(int[] row: rotatedArray){
        System.out.print("[");
        for(int num : row){
            System.out.print(num+" ");
        }
        System.out.print("]");
        System.out.println();
    }
   // return matrix;

    }
}


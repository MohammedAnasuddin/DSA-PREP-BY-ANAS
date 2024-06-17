package Multi_Dimensional_Arrays;

public class Matrix_Is_Symmetric {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 8 } };

        isMatrixSymmetric(matrix);
    }

    public static boolean isMatrixSymmetric(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            
            for(int j =0; j!=i && j<matrix.length ;j++){
                
                
                System.out.println("j,i: " + matrix[j][i]);
                System.out.println("i,j: " + matrix[i][j]);
                if(matrix[i][j] == matrix[j][i]){
                    continue;
                    
                }
                else{
                    System.out.println("Matrix is not Symmetric");
                    return false;
                }
            }


        

        }
        System.out.println("Matrix is Symmetric");
        return true;
    }
}
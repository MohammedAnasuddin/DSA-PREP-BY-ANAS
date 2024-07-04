

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = { { 9, 3 }, { 4, 0 }, { 4, 3 }, { 0, 0 }, { 1, 3 } };
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

        //Selecting the rows

        ArrayList<Integer> zeroRows = new ArrayList<>();
        for(int i =0; i<zero_indexes.size();i++){
                // if(zero_indexes.get(i).get(0)  == zero_indexes.get(i+1).get(0) ){
                if(zero_indexes.get(i).contains(zeroRows)){
                    continue;
                }
                else{
                    zeroRows.add(zero_indexes.get(i).get(0));
                }
        }
        //Selecting the columns
        ArrayList<Integer> zeroColumns = new ArrayList<>();
        for(int i =0; i<zero_indexes.size()-1;i++){ 
            if(zero_indexes.get(i).get(1)  == zero_indexes.get(i+1).get(1)){
                continue;
            }
            else{
                zeroColumns.add(zero_indexes.get(i).get(1));
            }


        }
System.out.print("Rows to make zer0: ");
for(int n : zeroRows){
    System.out.print(n+" ");
}

System.out.print("Columns to make zer0: ");
for(int n : zeroColumns){
    System.out.print(n+" ");
}


        for(int i = 0; i< zero_indexes.size();i++){
    
        //> Making the Row Zero
        for(int row =0 ; row<matrix[zero_indexes.get(i).get(0)].length; row++){
            if(matrix[zero_indexes.get(i).get(0)][row] == 0){
                continue;
            }
            else{

                matrix[zero_indexes.get(i).get(0)][row]=0;
            }
        }


        //> Making the Column Zero
        for(int column =0 ; column<matrix.length; column++){
            if(matrix[column][zero_indexes.get(i).get(1)] == 0){
                continue; 
            }
            else{

                matrix[column][zero_indexes.get(i).get(1)] =0;
            }
        }

        
    } 






}

}


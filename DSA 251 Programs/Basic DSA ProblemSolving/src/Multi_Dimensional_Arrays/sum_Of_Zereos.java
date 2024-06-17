package Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sum_Of_Zereos {
    public static void main(String[] args) {
        // - The <> notation is called the diamond operator and is used to define a generic type
        // - Using generics provides type safety and eliminates the need for type casting
        // - <> helps to type cast suppose if store int and string in a list you wold be able to
        // - acccess both using same method .get() with out any typecasting.

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        mat.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(0, 1, 0)));

        System.out.println("Current Multi Dimensional Array: ");
        for (ArrayList<Integer> row : mat) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        coverageOfMat(mat);

        
    }

    public static Integer coverageOfMat(ArrayList<ArrayList<Integer>> mat) {

        int coverage_sum = 0;

        ArrayList<ArrayList<Integer>> zero_cordinates = new ArrayList<>();

        // > Considered rows
        int row_index = 0; // to keep track of rows index
        for (ArrayList<Integer> row : mat) {
            System.out.println("**********************");
            System.out.println("Current row: " + row_index);
            System.out.println("row length: " + row.size());

            for (int i = 0; i < row.size(); i++) {
                System.out.println("---------------------");
                System.out.println("Current index: " + i);
                System.out.println("Current Element: " + row.get(i));
                if (row.get(i) == 0) {
                    // System.out.println("Current element is zero adding the cordinates");
                    zero_cordinates.add(new ArrayList<>(Arrays.asList(row_index, i)));

                    // > Inse he loic hee
                    try {
                        // > Checking for immediate right
                        if ((i + 1) < mat.get(row_index).size()) {
                            System.out.println("Immediate right: " + mat.get(row_index).get(i + 1));
                            if (mat.get(row_index).get(i + 1) == 1) {
    
                                coverage_sum++;
                                System.out.println("Coverage_sum after right: " + coverage_sum);
    
                            }
                        }
    
                        // > Checking for immediate left
                        if ((i - 1) >= 0) {
                            System.out.println("Immediate left: " + mat.get(row_index).get(i - 1));
                            if (mat.get(row_index).get(i - 1) == 1) {
    
                                coverage_sum++;
                                System.out.println("Coverage_sum after left: " + coverage_sum);
                            }
    
                        }
    
                        // > Checking top element
                        if ((row_index - 1) >= 0) {
                            System.out.println("Immediate top: " + mat.get(row_index - 1).get(i));
                            if (mat.get(row_index-1).get(i) == 1) {
    
                                coverage_sum++;
                                System.out.println("Coverage_sum after top: " + coverage_sum);
                            }
    
                        }
    
                        // > checking bottom element
                        if ((row_index + 1) < mat.size()) {
                            System.out.println("Immediate bottom: " + mat.get(row_index + 1).get(i));
                            if (mat.get(row_index+1).get(i) == 1) {
    
                                coverage_sum++;
                                System.out.println("Coverage_sum after bottom: " + coverage_sum);
                                
                                }
                                }
                                
                                continue;
                                
                                } catch (Exception e) {
                        System.out.println("Coverage_sum after exception : " + coverage_sum);
                        
                        continue;
                    }
                    
                }
            }

            row_index++;

        }
        System.out.println("Total coverage_sum: " + coverage_sum);
        return coverage_sum;
    }

}

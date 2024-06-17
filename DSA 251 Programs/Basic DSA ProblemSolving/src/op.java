package Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class op {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        mat.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        mat.add(new ArrayList<>(Arrays.asList(0, 1, 0)));

        for (ArrayList<Integer> row : mat) {
            for (int element : row) {

            }

        }

        coverageOfMat(mat);
    }

    public static Integer coverageOfMat(ArrayList<ArrayList<Integer>> mat) {

        int coverage_sum = 0;
        int row_index = 0;
        for (ArrayList<Integer> row : mat) {

            for (int i = 0; i < row.size(); i++) {

                if (row.get(i) == 0) {



                    try {

                        if ((i + 1) < mat.get(row_index).size()) {

                            if (mat.get(row_index).get(i + 1) == 1) {

                                coverage_sum++;

                            }
                        }

                        if ((i - 1) >= 0) {

                            if (mat.get(row_index).get(i - 1) == 1) {

                                coverage_sum++;

                            }

                        }

                        if ((row_index - 1) >= 0) {

                            if (mat.get(row_index - 1).get(i) == 1) {

                                coverage_sum++;

                            }

                        }

                        if ((row_index + 1) < mat.size()) {

                            if (mat.get(row_index + 1).get(i) == 1) {

                                coverage_sum++;

                            }
                        }

                        continue;

                    } catch (Exception e) {

                        continue;
                    }

                }
            }

            row_index++;

        }

        return coverage_sum;
    }

}

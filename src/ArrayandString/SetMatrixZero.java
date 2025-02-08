package ArrayandString;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row_zero = new HashSet<>();
        Set<Integer> column_zero = new HashSet<>();
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row_zero.add(i);
                    column_zero.add(j);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            if (row_zero.contains(i)) {
                for (int j = 0; j < matrix[0].length; j++) {
                        matrix[i][j] = 0;
                }
            }
            else {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (column_zero.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }

        }
    }
}

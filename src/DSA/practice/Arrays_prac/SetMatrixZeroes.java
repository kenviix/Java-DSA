// https://leetcode.com/problems/set-matrix-zeroes/description/

package DSA.practice.Arrays_prac;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
//        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] mat = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
//        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
        System.out.println(Arrays.deepToString(mat));
    }

    private static void setZeroes(int[][] matrix) {
        boolean col = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] == 0){

                   matrix[i][0] = 0;
                   if(j != 0){
                       matrix[0][j] = 0;
                   }else{
                       col = true;
                   }
               }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 | matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][0] == 0){
                matrix[0][i] = 0;
            }
        }

        if(col){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}

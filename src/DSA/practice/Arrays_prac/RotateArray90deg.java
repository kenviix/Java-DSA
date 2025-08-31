// https://leetcode.com/problems/rotate-image/description/

package DSA.practice.Arrays_prac;

import java.util.Arrays;

import static DSA.practice.Utilities.ReverseArray;

public class RotateArray90deg {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    private static void rotate(int[][] matrix)  {
        transpose(matrix);
        reverseCol(matrix);
    }

    private static void transpose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if(i == j){
                    continue;
                }
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverseCol(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            ReverseArray(matrix[i]);
        }
    }
}

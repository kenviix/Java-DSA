package DSA.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneDtoTwoD {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,9};
        int rows = 3;
        int cols = 2;
        System.out.println(Arrays.deepToString(convert(arr,rows,cols)));
    }
    static int[][] convert(int[] original,int m,int n){
        int[][] ans = new int[m][n];
        if(original.length != m*n){
            return new int[][]{};
        }
        int row = 0;
        int col = 0;
        int index = 0;
        while(row<m){
            while(col<n){
                ans[row][col] = original[index];
                index++;
                col++;
            }
            col = 0;
            row++;
        }
        return ans;
    }

}

package DSA.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[][] arr = {
                {3, 5, 1, 52, 4},
                {435, 21, 634, 1, 32},
                {32, 46, 16, 234, 45},
                {43, 32, 78, 12, 75}
        };

        int target = 100;
        System.out.println(Arrays.toString(searchTarget(arr, target)));


    }

    static int[] searchTarget(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

package DSA.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiral(matrix));

    }
    static List<Integer> spiral(int[][] m){
        int rows = m.length;
        int cols = m[0].length;
        int row = 0;
        int col = -1;
        int direction = 1;

        List<Integer> arr = new ArrayList<>();

        while(rows>0 && cols>0){
            for (int i = 0; i < cols; i++) {
                col+=direction;
                arr.add(m[row][col]);
            }
            rows--;
            for (int i = 0; i < rows; i++) {
                row+=direction;
                arr.add(m[row][col]);
            }
            cols--;

            direction *= -1;
        }

        return arr;
    }
}

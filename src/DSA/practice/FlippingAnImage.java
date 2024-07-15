package DSA.practice;

import java.sql.Array;
import java.util.Arrays;

// google
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        // reverse the array
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}

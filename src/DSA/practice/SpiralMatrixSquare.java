package DSA.practice;


import java.util.Arrays;

public class SpiralMatrixSquare {
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = create(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] create(int n) {
        int[][] m = new int[n][n];
        int rows = 3;
        int cols = 3;
        int row = 0;
        int col = -1;
        int direction = 1;
        int count = 1;
        while (rows > 0 && cols > 0) {
            for (int i = 0; i < cols; i++) {
                col += direction;
                m[row][col] = count;
                count++;
            }
            rows--;
            for (int i = 0; i < rows; i++) {
                row += direction;
                m[row][col] = count;
                count++;
            }
            cols--;

            direction *= -1;
        }
        return m;
    }
}

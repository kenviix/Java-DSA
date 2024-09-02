package DSA.practice;

import java.util.Arrays;

public class SpiralMatrix0 {
    public static void main(String[] args) {
        int[][] m = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        boolean fr = false;
        boolean fc = false;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[0].length - 1; j++) {
                if (m[i][j] == 0) {
                    if(i==0)fr = true;
                    if(j==0)fc = true;
                    m[0][j] = 0;
                    m[i][0] = 0;
                }
            }
        }
        for (int i = 1 ;i < m.length ; i++) {
            for (int j = 1; j < m[0].length ; j++) {
                if(m[i][0] == 0 || m[0][j] == 0){
                    m[i][j] = 0;
                }
            }
        }
        if(fr){
            for (int i = 0; i <= m[0].length-1; i++) {
                m[0][i] = 0;
            }
        }
        if(fc){
            for (int i = 0; i <= m.length-1; i++) {
                m[i][0] = 0;
            }
        }

        System.out.println(Arrays.deepToString(m));
    }
}

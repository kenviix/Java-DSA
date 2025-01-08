package DSA.practice;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        triangleSum(arr);
    }

    static void triangleSum(int[] arr){
        if(arr.length<1){
            return;
        }
        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i]+arr[i+1];
        }

        triangleSum(temp);
        System.out.println(Arrays.toString(arr));
    }
}

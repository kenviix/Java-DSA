package DSA.practice;

import java.util.Arrays;

// dont use division operator

public class ProductOfArraySelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
    static int[] product(int[] arr){
        int[] op = new int[arr.length];
        for (int i = 0; i < op.length; i++) {
            op[i]=1;
        }
        int left = 1;
        for (int i = 0; i < op.length; i++) {
            op[i] *= left;
            left *= arr[i];
        }
        int right =1 ;
        for (int i = op.length - 1; i >=0 ; i--) {
            op[i] *= right;
            right *= arr[i];
        }
        return op;
    }
}

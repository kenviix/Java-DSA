package DSA.practice;

import java.util.Arrays;

public class ProductOfArraySelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
    static int[] product(int[] arr){
        int[] op = new int[arr.length];
        int zeroes = 0;
        int indexzero = -1;
        int productOfIndex = 1;
        for(int num : arr){
            if(num == 0){
                zeroes++;
                indexzero = num;
            } else {
                productOfIndex *= num;
            }
        }
        if(zeroes == 0){
            for (int i = 0; i < arr.length; i++) {
                op[i] = productOfIndex/arr[i];
            }
        } else if (zeroes == 1) {
            op[indexzero] = productOfIndex;
        }
        return op;
    }
}

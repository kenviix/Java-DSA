// https://leetcode.com/problems/rotate-array/

package DSA.practice.Arrays_prac;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {1,2};
        int k = 7;
        rotate(arr,k);
    }

    private static void rotate(int[] arr,int k){

        k %= arr.length ;

        k= arr.length - k;
        reverse(arr,0, k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

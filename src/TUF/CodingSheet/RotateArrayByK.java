package TUF.CodingSheet;

//Rotate array by K elements : Block Swap Algorithm

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        k %= arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr, 0, k - 1);
        reverse(arr,k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {

       while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end ];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

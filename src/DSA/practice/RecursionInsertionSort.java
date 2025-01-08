package DSA.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursionInsertionSort{
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int n){
        if (n <= 1)
            return;

        sort( arr, n-1 );

        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}

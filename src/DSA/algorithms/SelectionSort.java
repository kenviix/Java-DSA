package DSA.algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,-5,7,2,5,2,9};
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }
}

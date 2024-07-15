package DSA.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,-7,7,6,8,9,4};
        int len = arr.length;
        boolean swapped;
        while(len>0){
            swapped = false;
            for(int i=0;i<len-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
            len--;
        }

        System.out.println(Arrays.toString(arr));
    }
}

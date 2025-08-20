package DSA.practice.Recursion_prac;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        revArr(arr,0);
        System.out.printf(Arrays.toString(arr));
    }

    static void revArr(int[] arr,int index){
        if(index>(arr.length-1)/2){
            return;
        }
        int temp = arr[index];
        arr[index] = arr[arr.length-1-index];
        arr[arr.length-1-index] = temp;
        revArr(arr,++index);
    }
}

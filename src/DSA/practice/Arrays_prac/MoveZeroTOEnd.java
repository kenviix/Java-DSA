// https://leetcode.com/problems/move-zeroes/description/

package DSA.practice.Arrays_prac;

import java.util.Arrays;

public class MoveZeroTOEnd {
    public static void main(String[] args) {
//        int[] arr = {0};
        int[] arr = {0,1,0,3,12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZero(int[] arr){
        int zeroPointer = 0;
        int numPointer = 0;

        while(numPointer < arr.length){
            if(arr[numPointer]!=0){
                int temp = arr[numPointer];
                arr[numPointer] = arr[zeroPointer];
                arr[zeroPointer] = temp;
                zeroPointer++;
            }
            numPointer++;
        }
    }
}

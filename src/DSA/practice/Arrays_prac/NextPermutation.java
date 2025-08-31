// https://leetcode.com/problems/next-permutation/description/

package DSA.practice.Arrays_prac;

import java.util.Arrays;

import static DSA.practice.Utilities.*;

public class NextPermutation {
    public static void main(    String[] args) {
//        int[] arr ={2,1,5,4,3,0,0};
//        int[] arr ={5,4,3,2,1};
//        int[] arr ={3,2,1};
//        int[] arr ={1,2,3};
        int[] arr ={1,1,5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutation(int[] nums) {
        int index = -1;

        for (int i = nums.length-2; i >= 0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index==-1){
            ReverseArray(nums);
            return;
        }

        for (int i = nums.length-1; i > index ; i--) {
            if(nums[i]>nums[index]){
                Swap(nums,i,index);
                break;
            }
        }

        Arrays.sort(nums,index+1,nums.length);

    }
}

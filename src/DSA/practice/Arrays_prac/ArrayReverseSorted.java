// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

package DSA.practice.Arrays_prac;

public class ArrayReverseSorted {
    public static void main(String[] args) {
//        int[] nums = {3,4,5,1,2};
//        int[] nums = {1,2,3};
        int[] nums = {2,1,3,4};
        System.out.print(check(nums));
    }
    private static boolean check(int[] nums) {
        int count=0;

        if(nums[0]<nums[nums.length-1]){
            count++;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }

            if(count>1){
                return false;
            }
        }
        return true;
    }
}

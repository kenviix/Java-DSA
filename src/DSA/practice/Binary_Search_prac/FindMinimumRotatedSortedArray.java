// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

package DSA.practice.Binary_Search_prac;

import static DSA.practice.Utilities.binaryPivot;

public class FindMinimumRotatedSortedArray {
    public static void main(String[] args) {
//        int[]  nums = {3,4,5,1,2};
//        int[]  nums = {4,5,6,7,0,1,2};
//        int[]  nums = {11,13,15,17};
        int[]  nums = {2,1};

        System.out.println(findMin(nums));
    }
    private static int findMin(int[] nums) {
        int pivot = binaryPivot(nums);
        if (pivot > nums.length - 1) {
            return nums[0];
        } else {
            return nums[ pivot + 1];
        }
    }
}

// https://leetcode.com/problems/maximum-subarray/description/

// divide and conquer

package DSA.practice.Recursion_prac;

public class MaxSubArraySumDAQ {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1};
        System.out.println(maxSubArray(nums,0,nums.length-1));
    }

    private static int maxSubArray(int[] nums,int l, int r) {

        if(l>r) return Integer.MIN_VALUE;

        int mid = (l+r)/2;
        int leftSum = 0;
        int rightSum = 0;
        int currSum = 0;

        for (int i = 0; i < mid; i++) {
            currSum+=nums[i];
            leftSum = Math.max(currSum,leftSum);
        }
        currSum = 0;
        for (int i = mid+1; i < r; i++) {
            currSum+=nums[i];
            rightSum = Math.max(currSum,rightSum);
        }

        return Math.max(Math.max(maxSubArray(nums,0,mid-1),maxSubArray(nums,mid+1,r)),leftSum+nums[mid]+rightSum);
    }
}

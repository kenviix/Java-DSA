// https://leetcode.com/problems/maximum-subarray/description/
// https://www.geeksforgeeks.org/dsa/largest-sum-contiguous-subarray/
package DSA.practice.Arrays_prac;

import java.util.ArrayList;
import java.util.Map;

public class KadanesMaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1};
        System.out.println(kadane(nums));

    }

    private static int kadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum = Math.max(num, sum + num);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

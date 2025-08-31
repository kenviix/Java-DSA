// https://leetcode.com/problems/two-sum/description/

package DSA.practice.Hashmap;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;

        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(numMap.containsKey(target - nums[i])){
                return new int[]{numMap.get(target-nums[i]),i};
            }else{
                numMap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}

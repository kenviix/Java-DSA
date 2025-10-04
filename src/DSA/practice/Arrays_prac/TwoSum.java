// https://leetcode.com/problems/two-sum/description/

package DSA.practice.Arrays_prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    // hashmap

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


    // two pointer only if sorted array is provided

//    private static int[] twoSum(int[] nums, int target) {
//       int i = 0;
//       int j = nums.length-1;
//
//       while(i<j){
//           if(nums[i]+nums[j]==target){
//               return new int[]{i,j};
//           } else if (nums[i]+nums[j]<target) {
//               i++;
//           }else {
//               j--;
//           }
//       }
//        return new int[]{-1,-1};
//    }

}

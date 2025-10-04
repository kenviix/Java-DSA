// https://leetcode.com/problems/3sum/description/

package DSA.practice.Arrays_prac;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    // Using Set
//    private static Set<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> ans = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            Set<Integer> set = new HashSet<>();
//            for (int j = i+1; j < nums.length; j++) {
//                int third = -(nums[i]+nums[j]);
//                if(set.contains(third)){
//                    List<Integer> list = new ArrayList<>();
//                    list.add(nums[i]);
//                    list.add(nums[j]);
//                    list.add(third);
//                    Collections.sort(list);
//                    ans.add(list);
//                }
//                set.add(nums[j]);
//            }
//        }
//        return ans;
//    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i+1,right = nums.length-1;
            while (left<right){
                int total = nums[i]+nums[left]+nums[right];
                if(total == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left] == nums[left+1]) left++;
                    while (left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if(total > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }

        return ans;
    }
}

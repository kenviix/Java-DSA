// https://leetcode.com/problems/4sum/

package DSA.practice.Arrays_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int target = 0;
//        int[] arr = {1, 0, -1, 0, -2, 2};
//        int target = 0;
//        int[] arr = {2,2,2,2,2};
//        int target = 8;
        System.out.println(fourSum(arr, target));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = nums.length - 1;

                while (left < right) {
                    long total = nums[i];
                    total += nums[j];
                    total += nums[left];
                    total += nums[right];

                    if (total == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        right--;
                        left++;
                    } else if (total > target) {
                        right--;
                    } else {
                        left++;
                    }

                }
            }

        }

        return ans;
    }
}

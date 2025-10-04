// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/
package DSA.practice.Binary_Search_prac;

import java.util.Arrays;

public class FirstAndLastPostionOfElement {
    public static void main(String[] args) {
//        int[] nums = {5,7,7,8,8,10};
//        int target = 8;
//        int[] nums = {5,7,7,8,8,10};
//        int target = 6;
//        int[] nums = {};
//        int target = 0;
        int[] nums = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Occurance: " + (ans[1] - ans[0] + 1) + " times");
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;
    }

    private static int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isSearchingLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }


}

// https://leetcode.com/problems/majority-element-ii/description/

package DSA.practice.Arrays_prac;

import java.util.ArrayList;
import java.util.List;

public class MajorityNumberII {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 3};
//        int[] arr = {1,2,2,3,2};
        int[] arr = {11,33,33,11,33,11};
        System.out.println(majorityElement(arr));
    }

    private static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int ct1 = 0;
        int ct2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ct1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                ct1++;
            } else if (ct2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                ct2++;
            } else if (nums[i] == el1) {
                ct1++;
            } else if (nums[i] == el2) {
                ct2++;
            }else{
                ct1--;
                ct2--;
            }
        }
        if(manualCheck(el1,nums)){
            ans.add(el1);
        }
        if(manualCheck(el2,nums)){
            ans.add(el2);
        }
        return ans;
    }

    private static boolean manualCheck(int el,int[] nums){
        int count = 0;
        for (int num : nums) {
            if (num == el) {
                count++;
            }
        }
        if(count> nums.length/3){
            return true;
        }else {
            return false;
        }
    }
}

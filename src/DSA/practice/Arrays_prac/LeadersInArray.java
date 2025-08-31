package DSA.practice.Arrays_prac;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
//        int[] nums = {10, 22, 12, 3, 0, 6};
        int[] nums = {4, 7, 1, 0};
        System.out.println(leaders(nums));
    }

    private static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxTillNow = Integer.MIN_VALUE;

        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i]>maxTillNow){
                ans.add(nums[i]);
                maxTillNow = nums[i];
            }
        }
        
        return ans;
    }
}

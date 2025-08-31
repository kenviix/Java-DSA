package DSA.practice.Arrays_prac;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,k));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        int preSum = 0;
        Map<Integer,Integer> numMap = new HashMap<>();
        numMap.put(0,1);

        for(int num:nums){
            preSum+=num;
            int remove = preSum - k;
            count += numMap.getOrDefault(remove,0);
            numMap.put(preSum,numMap.getOrDefault(preSum,0)+1);
        }


        return count;
    }
}

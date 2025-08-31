// https://leetcode.com/problems/majority-element/description/

package DSA.practice.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    private   static int majorityElement(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if (!numMap.containsKey(nums[i])){
                numMap.put(nums[i],1);
            }else{
                numMap.put(nums[i],numMap.get(nums[i])+1);
            }
        }

        for(int i : numMap.keySet()){
            if(numMap.get(i)>nums.length/2){
                return i;
            }
        }
        return 0;

    }
}

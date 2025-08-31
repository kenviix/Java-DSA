// The dutch national flag algorithm involves sorting the nums array by partitioning it into 3 segments.

// https://leetcode.com/problems/sort-colors/description/

package DSA.practice.Sorting;

import java.util.Arrays;

import static DSA.practice.Utilities.Swap;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid<=high){
            if(nums[mid]==0){
                Swap(nums,mid,low);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                Swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }


}

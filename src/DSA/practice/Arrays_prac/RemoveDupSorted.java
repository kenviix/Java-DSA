// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

package DSA.practice.Arrays_prac;

public class RemoveDupSorted {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int index = removeDuplicates(nums);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    private static int removeDuplicates(int[] nums) {
        int index = 0;
        int count = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
                count++;
            }
        }
        return count;
    }
}

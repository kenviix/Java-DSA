// https://leetcode.com/problems/majority-element/description/
// https://www.geeksforgeeks.org/theory-of-computation/boyer-moore-majority-voting-algorithm/
// The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element among the given elements that have more than N/ 2 occurrences.

package DSA.practice.Arrays_prac;

public class BoyerMooreMajorityVoting {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(boyerMooreMajorityVoting(nums));
    }

    private static int boyerMooreMajorityVoting(int[] nums){
        int candidate = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                candidate = nums[i];
                count++;
            }else{
                if(candidate == nums[i]){
                    count++;
                }else {
                    count--;
                }
            }
        }
        return candidate;
    }
}

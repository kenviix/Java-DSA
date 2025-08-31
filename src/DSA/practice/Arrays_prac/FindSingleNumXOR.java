// https://leetcode.com/problems/single-number/description/

package DSA.practice.Arrays_prac;

public class FindSingleNumXOR {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums){
            ans ^= num;
        }
        return ans;
    }
}

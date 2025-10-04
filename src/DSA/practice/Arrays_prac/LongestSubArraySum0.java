// https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum/

package DSA.practice.Arrays_prac;

import java.util.HashMap;

public class LongestSubArraySum0 {
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen(arr));
    }

    private static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (map.get(sum) != null) {
                    maxi = Math.max(maxi, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }

        }
        return maxi;
    }
}

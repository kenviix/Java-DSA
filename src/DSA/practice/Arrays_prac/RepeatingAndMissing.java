// https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/

package DSA.practice.Arrays_prac;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("missing: " + ans[0]);
        System.out.println("repeating: " + ans[1]);
    }


    // maths approach
    private static int[] findMissingRepeatingNumbers(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        long Nsum = ((long)n * (n + 1)) / 2;
        long N2sum = ((long)2 * n + 1) * (n + 1) * n / 6;
        long sum = 0;
        long sum2 = 0;


        for (int j : arr) {
            sum += j;
            sum2 += (long) j * j;
        }


        long val1 = sum - Nsum;
        long val2 = sum2 - N2sum;

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        ans[0] = (int) y;
        ans[1] = (int) x;
        return ans;
    }

    // bit approach

    // TBD

}

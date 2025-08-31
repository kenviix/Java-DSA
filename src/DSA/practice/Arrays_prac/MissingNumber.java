// https://leetcode.com/problems/missing-number/description/

package DSA.practice.Arrays_prac;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    private static int missingNumber(int[] arr) {
        int n = arr.length;
        int Nsum = n * (n+1) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return Nsum - sum;
    }
}

// https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/

package DSA.practice.Arrays_prac;

public class LongestSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 10;
        System.out.println(subLen(arr,k));
    }

    private static int subLen(int[] arr,int k){
        int maxLen = 0;
        int len = 0;
        int sum = 0;
        int i = 0;

        while (i<arr.length){
            sum+=arr[i];
            len++;
            if(sum == k){
                if(len > maxLen){
                    maxLen = len;
                }
                sum = 0;
                len = 0;
            }else if(sum > k){
                sum = 0;
                len = 0;
            }
            i++;
        }

        return maxLen;
    }
}

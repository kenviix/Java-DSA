package TUF.CodingSheet.Arrays;

public class MaximumProductOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for (int i = 0; i < arr.length; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;
            pre *= arr[i];
            suf *= arr[arr.length - i - 1];
            ans = Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}

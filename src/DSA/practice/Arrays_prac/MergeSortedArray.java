package DSA.practice.Arrays_prac;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0},  nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)return;
        int len1 = nums1.length;
        int end_idx = len1-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[end_idx] = nums2[n-1];
                n--;
            }else{
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }
        while (n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        }

    }
}

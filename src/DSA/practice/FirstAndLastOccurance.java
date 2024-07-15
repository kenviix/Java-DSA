package DSA.practice;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(CheckOccurance(arr, target)));
    }

    static int[] CheckOccurance(int[] arr, int target) {
        int[] ans = {-1, -1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
//        return new int[]{start,end};
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}

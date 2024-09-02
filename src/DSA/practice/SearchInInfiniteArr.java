package DSA.practice;

import java.util.Arrays;

public class SearchInInfiniteArr {
    public static void main(String[] args) {
        // infinte array means we cant use length
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 16, 18, 25, 29, 30, 38};
        int target = 7;
        System.out.println(rangeOfArr(arr,target));
    }

    static int rangeOfArr(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
       return binary(arr,target,start,end);
    }

    static int binary(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

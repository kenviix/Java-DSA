package DSA.practice;

import java.util.Arrays;

public class Utilities {
    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void DescendingSortArray(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                if (nums[i] > nums[j]) {
                    Swap(nums, i, j);
                }
            }
        }
    }

    public static void ReverseArray(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            Swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static int MaxInArray(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static int binaryPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

}

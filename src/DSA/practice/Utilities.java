package DSA.practice;

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
}

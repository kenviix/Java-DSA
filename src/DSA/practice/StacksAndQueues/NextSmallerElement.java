package DSA.practice.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
//        int[] arr = {4, 8, 5, 2, 25};
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(nextSmallerElement(arr)));
    }

    private static int[] nextSmallerElement(int[] nums){
        int l = nums.length;
        int[] ans = new int[l];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length-1 ; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]){
                stack.pop();
            }
            ans[i] = stack.empty()?-1:stack.peek();
            stack.push(nums[i]);
        }

        return ans;
    }
}

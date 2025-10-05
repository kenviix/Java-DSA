package DSA.practice.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
//        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    private static int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        Stack<Integer> stack = new Stack<>();
        for (int i = (2* l)-1; i >=0  ; i--) {
            while(!stack.isEmpty() && stack.peek()<=nums[i%l]){
                stack.pop();
            }
            if(i<l){
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i%l]);
        }

        return ans;
    }
}

package DSA.practice.StacksAndQueues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums2[i]) st.pop();
            if (st.empty()) mpp.put(nums2[i], -1);
            else mpp.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) ans[i] = mpp.get(nums1[i]);
        return ans;
    }
}

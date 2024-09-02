package DSA.practice;

import java.util.Arrays;

public class FirstPositiveNo {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(find(arr));
    }

    static int find(int[] nums) {
        int numsLength = nums.length;
        int i = 0;


        while (i < numsLength) {

            int valAtI = nums[i] - 1;
            boolean belongsInRange = valAtI >= 0 && valAtI < numsLength;

            if (belongsInRange && nums[i] != nums[valAtI]) {
                int temp = nums[i];
                nums[i] = nums[valAtI];
                nums[valAtI] = temp;
            } else {
                i++;
            }
        }


        for (int x = 0; x < numsLength; x++) {

            if (x + 1 != nums[x]) {
                return x + 1;
            }
        }
        return numsLength + 1;
    }
}

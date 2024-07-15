package DSA.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 60, 7896};
        System.out.println(findEvenNoDigits(nums));
    }

    static int findEvenNoDigits(int[] nums) {
        int numCount = 0;
        for (int num : nums) {
            int digitCount = 0;
            while (num > 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                numCount++;
            }
        }
        return numCount;
    }
}

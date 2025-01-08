package TCS;

/*

## Problem Statement

Write a Java program to check whether a given number is a perfect square or not

### Condition

Input will only be a positive interger and will not have any decimal or special characters

## Input

    9

## Output

    TRUE

## Explanation

> A positive integer is a perfect square if it is the product of some integer with itself.
> As `9` is a square of `3` (ie., `3 * 3 = 9`).


 */

import java.io.PrintStream;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        double result = Math.sqrt(num);
        if((int)result == result){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
//        System.out.println(perfectSqr(num));
    }
    static boolean perfectSqr(int num){
        if (num == 1){
            return true;
        }

        int start = 1;
        int end = num/2;

        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid*mid == num){
                return true;
            } else if (mid*mid<num) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}

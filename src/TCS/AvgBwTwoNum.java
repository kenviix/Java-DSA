package TCS;

import java.util.Scanner;

public class AvgBwTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int start = in.nextInt();
        int end = in.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            count++;
            sum += arr[start];
        }

        System.out.println(sum/count);
    }
}

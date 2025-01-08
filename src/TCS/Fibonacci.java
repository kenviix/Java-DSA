package TCS;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while (limit > 0){
            int sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
            limit--;
        }

    }

}

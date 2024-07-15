package DSA.practice;

import java.util.Scanner;

public class OddEvenBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if((num & 1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}

package TCS;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while (temp>0){
            sum += (int)Math.pow(temp%10,3);
            temp /= 10;
        }
        if(sum == num){
            System.out.println("armstrong");
        }else {
            System.out.println("not armstrong");
        }
    }
}

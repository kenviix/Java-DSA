package DSA.practice;

// enter 4 numbers in test cases


import java.util.Scanner;

public class CustomFibRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int limit = in.nextInt();
        System.out.println(customFib(num1,num2,num3,limit));

    }
    static int customFib(int num1,int num2,int num3,int limit){
        if(limit <= 3){
            return num3;
        }
        return customFib(num2,num3,num1+num2+num3,limit-1);
    }
}

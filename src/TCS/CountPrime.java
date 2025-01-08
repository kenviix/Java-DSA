package TCS;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println(isPrime(num));
            if(isPrime(num)){
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean isPrime(int num){

        for (int i = 2 ; i < num; i++) {
           if(num%i == 0){
               return false;
           }
        }
        return true;
    }
}

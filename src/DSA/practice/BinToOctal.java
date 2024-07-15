package DSA.practice;

import java.util.ArrayList;

public class BinToOctal {
    public static void main(String[] args) {
        int bin = 1010;
        int dec = convertToDec(bin);
        convertToOctal(dec);
    }

    private static void convertToOctal(int dec) {
        ArrayList<Integer> octal = new ArrayList<>();
        while(dec>0){
            int rem = dec % 8;
            dec/=8;
            octal.add(rem);
        }
        for (int i = octal.size()-1; i >= 0 ; i--) {
            System.out.print(octal.get(i));
        }
    }

    private static int convertToDec(int bin) {
        int dec = 0;
        int i = 0;
        while(bin>0){
            int digit = bin % 10;
            dec += digit*(Math.pow(2,i));
            bin/=10;
            i++;
        }
        return dec;
    }
}

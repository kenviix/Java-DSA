package DSA.practice;

public class OctalToDec {
    public static void main(String[] args) {
        int octal = 50;
        System.out.println(convert(octal));
    }

    private static int convert(int num) {
        int dec = 0;
        int i = 0;
        while (num > 0) {
            int digit = num % 10;
            dec += digit * (Math.pow(8, i));
            num /= 10;
            i++;
        }
        return dec;
    }
}

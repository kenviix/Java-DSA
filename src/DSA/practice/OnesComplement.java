package DSA.practice;

public class OnesComplement {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findComplement(n));
    }
    static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();


       int mask = (1 << bitLength) - 1;

        return num ^ mask;
    }
}

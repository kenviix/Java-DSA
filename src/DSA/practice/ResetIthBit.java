package DSA.practice;

public class ResetIthBit {
    public static void main(String[] args) {
        int bits = 10;
        int position = 2;
        System.out.println(resetBit(bits,position));
    }
    private static int resetBit(int bits, int position) {
        int mask = (int)(1*Math.pow(2,position-1));
        mask = ~mask;
//        System.out.println(mask);
        return bits & mask;
    }
}

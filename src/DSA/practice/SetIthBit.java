package DSA.practice;

public class SetIthBit {
    public static void main(String[] args) {
        int bits = 10;
        int position = 3;
        System.out.println(setBit(bits,position));
    }
    private static int setBit(int bits, int position) {
        int mask = (int)(1*Math.pow(2,position-1));
//        System.out.println(mask);
        return bits | mask;
    }
}

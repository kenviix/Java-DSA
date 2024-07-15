package DSA.practice;

public class IthBit {
    public static void main(String[] args) {

    }

    private static int findBit(int bits, int position) {
        int mask = (int)(1*Math.pow(2,position-1));
//        System.out.println(mask);
        return bits & mask;
    }

}

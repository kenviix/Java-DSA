package DSA.practice;

public class ShiftOperations {
    public static void main(String[] args) {
        int num = 10;
        int shift = 2;
        shift(num, shift);
    }

    private static void shift(int num, int shift) {
        // left shift
        int leftShifted = (int) (num * (Math.pow(2, shift)));
        System.out.println("left shifted: " + leftShifted);

        // right shift
        int rightShifted = (int) (num / (Math.pow(2, shift)));
        System.out.println("right shifted: " + rightShifted);
    }
}

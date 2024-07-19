package DSA.practice;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println("hcf: " + hcf(4, 20));
        System.out.println("lcm: " + lcm(2, 7));
    }

    private static int hcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }

    private static int lcm(int a, int b) {
        return a * b / hcf(a, b);
    }
}

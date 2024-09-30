package DSA.practice;

public class MinBitsFlips {
    public static void main(String[] args) {
        int start = 3;
        int goal = 4;
        int ans = 0;
        int xor = start ^ goal;
        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        System.out.println(ans);
    }
}

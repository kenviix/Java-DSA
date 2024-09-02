package DSA.practice;

public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n + i - 1; j++) {
                String style = j <= n - i ? "  " : "* ";
                System.out.print(style);
            }
            System.out.println();
        }
    }
}

package DSA.practice;

public class Pattern_7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                String style = j <= n - i  ? "  " : "* ";
                System.out.print(style);
            }
            System.out.println();
        }
    }
}

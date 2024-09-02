package DSA.practice;

public class Pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n + i; j++) {
                String style = j <= n - i - 1 ? "  " : "* ";

                System.out.print(style);

            }
            System.out.println();
        }
    }
}

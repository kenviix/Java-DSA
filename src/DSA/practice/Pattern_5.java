package DSA.practice;

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = n - 1; i > 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int row = 0; row < 2 * n; row++) {
            int totalColsRows = row > n ? 2 * n - row  : row;
            for (int col = 0; col < totalColsRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

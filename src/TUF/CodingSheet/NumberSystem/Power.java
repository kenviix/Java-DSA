package TUF.CodingSheet.NumberSystem;

public class Power {
    public static void main(String[] args) {
        int num = 2;
        int power = 21;
        System.out.println(myPow(num,power));
    }

    static double myPow(double x, int n) {

        double ans = 1;

        double oriNum = n;

        if (x == 0 || x == 1) {
            return x;
        }

        if (n < 0) {
            x = 1 / x;
            n = -(n + 1);
            ans = ans * x;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            }
            else {
                n = n / 2;
                x = x * x;
            }
        }
        return ans;
    }
}

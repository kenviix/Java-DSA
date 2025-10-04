package DSA.practice;

public class BasicMaths {
    public static int Factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * Factorial(n - 1);
    }



    public static int nCr(int n,int r){
        // nCr = n! / (r! * (n – r)!)
        int ans = 1;
        for (int i = 0; i < r; i++) {
            ans *= n-i;
            ans /= i+1;
        }
        return ans;
    }
}

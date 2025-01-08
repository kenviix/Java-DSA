package DSA.practice;

public class PrimeRec {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPrime(num,2));
    }

    static boolean isPrime(int num,int n){
        if(num <= 2){
            return (num == 2)?true:false;
        }
        if(num%n==0){
            return false;
        }
        if(n * n > num){
            return true;
        }

        return isPrime(num,n+1);

    }
}

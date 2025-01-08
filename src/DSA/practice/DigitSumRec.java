package DSA.practice;

public class DigitSumRec {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(sum(num));
    }

    static int sum(int num){
        if(num<=0){
            return 0;
        }
        int temp = num%10;
        return sum(num/10) + temp;
    }
}

package DSA.practice;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        while(fast!=1 && sum(fast)!=1){
            fast = sum(sum(fast));
            slow = sum(slow);
            if(slow == fast){
                return false;
            }
        }
        return true;
    }
    static int sum(int n){
        int s = 0;
        while(n>0){
            int d = n%10;
            s += d*d;
            n /= 10;
        }
        return s;
    }
}

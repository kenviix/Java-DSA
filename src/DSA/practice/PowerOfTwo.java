package DSA.practice;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        if((n&(n-1))==0){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not power of 2");
        }
    }
}

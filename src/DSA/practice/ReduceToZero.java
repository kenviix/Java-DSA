package DSA.practice;

public class ReduceToZero {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(reduced(num));
    }
    static int reduced(int num){
        if(num==0){
            return 0;
        }
        if(num%2==0){
            return reduced(num/2)+1;
        }
        else{
            return reduced(num-1)+1;
        }
    }
}

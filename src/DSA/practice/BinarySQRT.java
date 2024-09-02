package DSA.practice;

public class BinarySQRT {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n){
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mid == n/mid){
                return mid;
            } else if (mid > n/mid) {
                end--;
            }else{
                start++;
            }
        }
        return end;
    }
}

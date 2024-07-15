package DSA.practice;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {3,3,6,6,4,4,1,7,1};
        System.out.println(ans(arr));
    }
    public static  int ans(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }

}

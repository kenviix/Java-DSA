package DSA.practice.Binary_Search_prac;

public class SquareRoot {
    public static void main(String[] args) {
//        int n = 25;
//        int n = 16;
        int n = 35;
        System.out.println(root(n));
        System.out.println(floorRoot(n));
    }
    private static int root(int n){
        int start = 0;
        int end = n;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid*mid == n){
                return mid;
            }else if(mid*mid > n){
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

    private static int floorRoot(int n){
        int start = 0;
        int end = n;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid*mid < n){
                start = mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }
}

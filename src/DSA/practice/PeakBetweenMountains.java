package DSA.practice;

public class PeakBetweenMountains {
    public static void main(String[] args) {
        int[] mountains = {1,2,1,3,5,6,4};
        System.out.println(peak(mountains));
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid+1] < arr[mid]) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}

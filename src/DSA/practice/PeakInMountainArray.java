package DSA.practice;

public class
PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(arr[SearchTarget(arr)]);
    }

    static int SearchTarget(int[] arr) {
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

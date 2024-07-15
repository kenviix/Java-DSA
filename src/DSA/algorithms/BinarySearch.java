package DSA.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 13, 25, 39, 43, 58, 63, 64, 73, 86, 91, 99};
        int target = 99;
        System.out.println(findTarget(arr,target));
    }

    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid+1;
            }else if(target < arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

package DSA.algorithms;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2, 6, 13, 25, 39, 43, 58, 63, 64, 73, 86, 91, 99};
        int[] arr = {98,84,73,63,68,50,47,33,28,19,7};
        int target = 73;
        System.out.println(findTarget(arr,target));
    }

    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc ;
        isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end=mid-1;

                }else{
                    start = mid+1;
                }
            }else{
                if (target > arr[mid]) {
                    end=mid-1;
                }else{
                    start = mid+1;

                }
            }

        }
        return -1;
    }
}

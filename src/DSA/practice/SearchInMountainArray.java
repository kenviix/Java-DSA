package DSA.practice;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = arr[SearchPeak(arr)];
        int ans = SearchTarget(arr,target,0,peak);
        if(ans!=-1){
            System.out.println(ans);
        }else{
            System.out.println(SearchTarget(arr,target,peak,arr.length-1));
        }


    }
    static int SearchPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int SearchTarget(int[] arr,int target,int start,int end){
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

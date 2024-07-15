package DSA.practice;

public class KthPostion {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low=0; int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);

            if(missing<k){
                low=mid+1;
            } else{
                high= mid-1;
            }
        }
        return high+1+k;

    }
}

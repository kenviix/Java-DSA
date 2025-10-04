package DSA.practice.Binary_Search_prac;

public class FloorAndCeiling {
    public static void main(String[] args) {
//        int[] arr = {3,5,8,15,19};
//        int x = 9;
        int[] arr = {1,2,2,3};
        int x = 2;
        System.out.println(ceiling(arr,x));
        System.out.println(floor(arr,x));
    }

    // ceil / lower bound

    public static int ceiling(int[] arr,int x){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;


        while (start<=end){
            int mid = start+(end - start) /2;
            if(arr[mid] >= x){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }

    // floor / upper bound

    public static int floor(int[] arr,int x){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;


        while (start<=end){
            int mid = start+(end - start) /2;
            if(arr[mid] <= x){
                ans = mid;
                start = mid+1;

            }else{

                end = mid-1;
            }
        }

        return ans;
    }

}

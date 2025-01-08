package DSA.practice;

public class MinMaxRec {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(min(arr, arr.length));
        System.out.println(max(arr,arr.length));
    }
    static int min(int[] arr,int len){
        if(len==1){
            return arr[0];
        }

        return Math.min(arr[len - 1],min(arr,len - 1) );
    }

    static int max(int[] arr,int len){
        if(len==1){
            return arr[0];
        }

        return Math.max(arr[len - 1],max(arr,len - 1) );
    }
}

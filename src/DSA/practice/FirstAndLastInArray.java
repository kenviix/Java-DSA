package DSA.practice;

public class FirstAndLastInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,5,6,14,14,14,15};
        int target = 14;
        System.out.println(binary(arr,target,true));
        System.out.println(binary(arr,target,false));
    }
    static int binary(int[] arr,int target,boolean left){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                index = mid;
                if(left){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else if (arr[mid]>target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return index;
    }
}

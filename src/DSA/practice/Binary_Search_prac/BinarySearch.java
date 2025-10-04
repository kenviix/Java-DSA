package DSA.practice.Binary_Search_prac;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
//        int target = 12;
//        int target = -1;
//        int target = 15;
        System.out.println(binarySearch(nums,target,0,nums.length -1));
    }

    public static int binarySearch(int[] nums,int target,int start, int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

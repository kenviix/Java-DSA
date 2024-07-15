package DSA.practice;

public class Floor {
    public static void main(String[] args) {
        int[] num = {2,3,5,8,14,16,18};
        int target = 15;
        System.out.println(FloorSearch(num,target));
    }
    static int FloorSearch(int[] num,int target){
        if(target<num[num.length-1]){
            return -1;
        }
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(num[mid]>target){
                end = mid-1;
            }else if(num[mid]<target){
                start = mid+1;
            }else{
                return num[mid];
            }
        }
        return num[end];
    }
}

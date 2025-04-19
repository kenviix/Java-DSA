package TUF.CodingSheet.Arrays;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] nums = {1,2,-1,1,3,1};
        findElement(nums);
    }
    static void findElement(int[] nums){
        boolean check;
        for (int i = 0; i < nums.length; i++) {
            check=false;
            for (int j = 0 ; j < nums.length; j++) {
                if(i!=j && nums[i] == nums[j]){
                    check=true;
                    break;
                }
            }
            if(!check) System.out.print(nums[i]+" ");
        }
    }
}

package DSA.practice;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,1,0,2,1};
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for(int num : nums){
            if(num == 0){
                zeroes++;
            }else if(num == 1){
                ones++;
            }else{
                twos++;
            }
        }
        set(nums,0,zeroes,0);
        set(nums,zeroes,ones+zeroes,1);
        set(nums,ones+zeroes,nums.length,2);
        System.out.println(Arrays.toString(nums));

    }

    static void set(int[] arr,int start,int end,int value){
        for(int i = start;i<end;i++){
            arr[i] = value;
        }
    }
}

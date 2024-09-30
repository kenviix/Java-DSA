package DSA.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class XORQuesriesOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xor(arr,queries)));
    }
    static int[] xor(int[] arr,int[][] queries){
//        int[] ans = new int[queries.length];
//        int count = 0;
//        for(int[] query:queries){
//            int start = query[0];
//            int end = query[1];
//            int sum = arr[start];
//            for (int i = start+1; i <= end ; i++) {
//                sum = sum^arr[i];
//            }
//            ans[count++]=sum;
//        }
//        return ans;

        int[] ans = new int[queries.length];
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        // fill the prefix xor array
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] ^ arr[i];
        }

        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                ans[i] = prefix[right];
            }else{
                ans[i] = prefix[right]^prefix[left-1];
            }
        }
        return ans;
    }
}

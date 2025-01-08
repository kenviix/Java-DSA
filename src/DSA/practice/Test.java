                                                                                                         package DSA.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Math.floor(Math.sqrt(26)));
    }

    public static int sqrt(int num){
        int start = 1;
        int end = num;
        int root = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid == num){
                return mid;
            }else if(mid*mid>num){
                end--;
                root=mid;
            }else {
                start++;
                root=mid;
            }
        }
        return root;
    }


}

package DSA.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chars = {'c','f','j','j'};
        System.out.println(nextGreatestLetter(chars,'c'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }

        return letters[start%letters.length];
    }

}

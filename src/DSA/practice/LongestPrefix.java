package DSA.practice;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        int index = 0;
        for(int i=0; i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
                index++;
        }
        System.out.println(strs[0].substring(0,index));
    }
}

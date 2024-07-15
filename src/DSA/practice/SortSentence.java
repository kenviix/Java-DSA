package DSA.practice;

import java.util.Arrays;
import java.util.StringJoiner;

public class SortSentence {
    public static void main(String[] args) {
        String str ="is2 sentence4 This1 a3";
        String[] arr = str.split(" ");
        String[] ans1 = new String[arr.length];

        for(String each : arr){
            char index = each.charAt(each.length()-1);
            ans1[Character.getNumericValue(index)-1]=each.substring(0,each.length()-1);
        }
        System.out.println(String.join(" ",ans1));
        System.out.println(Arrays.toString(ans1));
    }
}

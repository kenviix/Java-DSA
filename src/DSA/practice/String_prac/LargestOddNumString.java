// https://leetcode.com/problems/largest-odd-number-in-string/

package DSA.practice.String_prac;

public class LargestOddNumString {
    public static void main(String[] args) {
//        String num = "35427";
//        String num = "7542351161";
        String num = "239537672423884969653287101";
//        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0 ; i--) {
            if((num.charAt(i)-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

// https://leetcode.com/problems/rotate-string/description/

package DSA.practice.String_prac;

public class RotateString {
    public static void main(String[] args) {
//        String s = "abcde", goal = "cdeab";
        String s = "abcde", goal = "abced";
        System.out.println(rotateString(s,goal));
    }
    private static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String compare = s+s;
        if(compare.contains(goal))return true;
        else return false;
    }
}

// https://leetcode.com/problems/reverse-words-in-a-string/

package DSA.practice.String_prac;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    private static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;
        int j = s.length()-1;

        while (i>=0 && j>=0){

            if(s.charAt(i-1) == ' ' && s.charAt(i)!=' '){
                ans.append(" ");
                ans.append(s.substring(i,j+1));
                j=i;
            }
            i--;

        }

        return ans.toString();
    }
}

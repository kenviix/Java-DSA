package DSA.practice;

public class ShortestPalindrome {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(palindrome(s));
    }

    static String palindrome(String s){
        char[] chars = s.toCharArray();
        
        int end = 0;

        for (int i = chars.length -1; i > 0 ; i--) {
            int left = 0;
            int right = i;
            while(left<right && chars[left] == chars[right]){
                left--;
                right++;
            }
            if(left>=right){
                end = i;
                break;
            }
        }
        return new StringBuilder(s).reverse().append(s.substring(++end)).toString();
    }
}

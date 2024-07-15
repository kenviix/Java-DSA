package DSA.practice;

public class PalindromeDelete {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }
    static boolean  validPalindrome(String s) {
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        StringBuilder reverse = new StringBuilder();
        reverse.append(s);
        reverse.reverse();

        if(s.contentEquals(reverse)){
            return true;
        }else{
            for (int i = 0,j= s.length()-1; i < s.length()/2; i++,j--) {
                if(s.charAt(i)!=s.charAt(j)){
                    StringBuilder first =  new StringBuilder(s.substring(0, i) + s.substring(i+1));
                    StringBuilder second =  new StringBuilder(s.substring(0, j) + s.substring(j+1));

                    if(first.toString().contentEquals(first.reverse())){
                        return true;
                    }else if(second.toString().contentEquals(second.reverse())){
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
    return false;
    }
}

package DSA.practice;

public class PrefixReverse {
    public static void main(String[] args) {
        String str = "abcdefd";
        System.out.println(reversePrefix(str,'d'));
    }
    static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder reversed = new StringBuilder(word.substring(0,index+1));
        reversed.reverse();
        reversed.append(word.substring(index+1));
        return reversed.toString();
    }
}

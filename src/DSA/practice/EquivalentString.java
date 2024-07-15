package DSA.practice;

public class EquivalentString {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        boolean ans = String.join("", word1).equals(String.join("", word2));


    }
}

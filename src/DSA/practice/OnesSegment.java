package DSA.practice;

public class OnesSegment {
    public static void main(String[] args) {
        String str = "1";
        System.out.println(checkOnesSegment(str));
    }

    static boolean checkOnesSegment(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (ch[i + 1] == '1' && ch[i] == '0') {
                return false;
            }
        }
        return true;
    }
}

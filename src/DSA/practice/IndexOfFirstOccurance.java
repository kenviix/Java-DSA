package DSA.practice;

public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbkgghsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));


    }
    static int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }

        }
        return -1;

    }

}

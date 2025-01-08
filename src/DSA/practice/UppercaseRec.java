package DSA.practice;

public class UppercaseRec {
    public static void main(String[] args) {
        String str = "geeksforgeekS";
        System.out.println(findUppercase(str,0 ));;
    }

    static char findUppercase(String str,int len ){
        if(len == str.length() ){
            return 0;
        }

        if(Character.isUpperCase(str.charAt(len))){
            return str.charAt(len);
        }else {
            return findUppercase(str,len+1);
        }
    }

}

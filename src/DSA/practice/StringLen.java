package DSA.practice;

public class StringLen {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(strlen(str));
    }

    static int strlen(String str){
        if(str.equals("")) {
            return 0;
        }else{
            return strlen(str.substring(1))+1;
        }
    }
}

package DSA.practice;

public class Decrypt_string {
    public static void main(String[] args) {
        String s = "10#11#12";
        StringBuilder str = new StringBuilder();
        int i = s.length() -1 ;
        while (i>=0){
            int ascii = 0;
            if(s.charAt(i)=='#'){
                int a =  Integer.parseInt(s.substring(i-2,i))+96;
                str.append((char)a);
                i-=3;
            }else{
                int a =  Integer.parseInt(s.substring(i,i+1))+96;
                str.append((char) a);
                i--;
            }
        }
        System.out.println(str);
    }
}

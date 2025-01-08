package DSA.practice;

import java.util.Arrays;

public class RevStringRec {
    public static void main(String[] args) {
        String[] str = {"h","e","l","l","o"};
        revStr(str,0);
        System.out.println(Arrays.toString(str));
    }

    static void revStr(String[] str,int index){
        if(index == str.length/2){
            return;
        }
        String temp = str[index];
        str[index] = str[str.length - index - 1];
        str[str.length - index - 1] = temp;
        revStr(str,index+1);
    }
}

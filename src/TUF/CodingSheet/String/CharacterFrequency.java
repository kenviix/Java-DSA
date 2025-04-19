package TUF.CodingSheet.String;

import java.util.Arrays;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "takeuforward";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
             count[(int)str.charAt(i)-97]+=1;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i]>0){
                System.out.print((char)(i + 97));
                System.out.print(" ");
                System.out.print(count[i]);
                System.out.print(", ");
            }
        }
    }

}

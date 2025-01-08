package TCS;

import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(!ans.contains(String.valueOf(str.charAt(i)))){
                ans = ans+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

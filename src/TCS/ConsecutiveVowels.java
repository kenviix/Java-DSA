package TCS;

import java.util.Scanner;

public class ConsecutiveVowels {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        int i = 0;
        int count = 0;
        while (i<str.length()){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                if(i < str.length() - 1 && str.charAt(i + 1) == 'a' || str.charAt(i + 1) == 'e' || str.charAt(i + 1) == 'i' || str.charAt(i + 1) == 'o' || str.charAt(i + 1) == 'u' ){
                    count++;
                    i=i+2;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}

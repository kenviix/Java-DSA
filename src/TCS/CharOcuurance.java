package TCS;

import java.util.Scanner;

public class CharOcuurance {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        char ch = in.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println(count);
    }
}

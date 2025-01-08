package TCS;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(" ");
        StringBuilder start = new StringBuilder();
        StringBuilder end = new StringBuilder();
        for(String string:arr){
            start.append(string.charAt(0));
            end.append(string.charAt(string.length() - 1));
        }
        System.out.println(start);
        System.out.println(end);
    }
}

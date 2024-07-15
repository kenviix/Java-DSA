package DSA.practice;

import java.util.ArrayList;

public class DecToBin {
    public static void main(String[] args) {
        int num = 10;
        convert(num);
    }
    private static void convert(int num){
        ArrayList<Integer> binary = new ArrayList<>();
        while(num>0){
            int rem = num%2;
            num = num/2;
            binary.add(rem);
        }
        for (int i = binary.size()-1; i >= 0 ; i--) {
            System.out.print(binary.get(i));
        }
    }
}

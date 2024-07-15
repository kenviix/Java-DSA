package DSA.practice;

import java.util.Arrays;

public class RobotReturnsToOrigin {
    public static void main(String[] args) {
        String str = "UD";
        System.out.println(judgeCircle(str));
    }

    static boolean judgeCircle(String moves) {
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < moves.length(); i++) {
//            if (moves.charAt(i) == 'R') {
//                x++;
//            } else if (moves.charAt(i) == 'L') {
//                x--;
//            } else if (moves.charAt(i) == 'U') {
//                y++;
//            } else{
//                y--;
//            }
//        }
//
//        return x == 0 && y == 0;

//        =====faster=====

        int UpDown = 0;
        int LeftRight = 0;

        for (char c : moves.toCharArray() )
        {
            switch (c){
                case 'U':
                    UpDown++;
                    break;
                case 'D':
                    UpDown--;
                    break;
                case 'L':
                    LeftRight++;
                    break;
                case 'R':
                    LeftRight--;
                    break;
            }
        }
        return (LeftRight == 0 && UpDown == 0);
    }
}

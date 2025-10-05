package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
//        String s =  "abc*+d-";
//        String s =  "ab+";
        String s =  "ab-de+f*/";
        System.out.println(postfixToPrefix(s));
    }

    private static String postfixToPrefix(String s){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(c+"");
            }else{
                String suf = stack.pop();
                String pre = stack.pop();
                stack.push(c+pre+suf);
            }
        }
        return stack.peek();
    }
}

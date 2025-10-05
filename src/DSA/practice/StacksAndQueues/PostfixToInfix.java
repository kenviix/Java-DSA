package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
//        String s =  "ab*cd/+";
        String s =   "ab+c*";
        System.out.println(postfixToInfix(s));
    }
    private static String postfixToInfix(String s){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(c+"");
            }else{
                String pre = stack.pop();
                String suf = stack.pop();

                stack.push("("+suf+c+pre+")");
            }
        }
        return stack.peek();
    }
}

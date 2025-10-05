package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
//        String s = "*+ab-cd";
        String s = "+ab";
        System.out.println(prefixToInfix(s));
    }
    private static String prefixToInfix(String s){
        Stack<String> stack = new Stack<>();

        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stack.push(c+"");
            }else {
                String pre = stack.pop();
                String suf = stack.pop();
                stack.push("("+pre + c + suf+")");
            }
        }

        return stack.peek();
    }
}

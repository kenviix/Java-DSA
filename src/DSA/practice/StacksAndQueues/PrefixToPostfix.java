package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
//        String s = "/-ab*+def";
        String s = "*+ab-cd";
        System.out.println(prefixToPostfix(s));
    }

    private static String prefixToPostfix(String s){
        Stack<String> stack = new Stack<>();

        for (int i = s.length()-1; i >= 0 ; i--) {
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(c+"");
            }else{
                String pre = stack.pop();
                String suf = stack.pop();
                stack.push(pre+suf+c);
            }
        }

        return stack.peek();
    }
}

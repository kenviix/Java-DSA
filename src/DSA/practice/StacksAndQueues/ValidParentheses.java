package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        String str = "()[]{}";
//        String str = "[()]{}";
        String str = "([)]";
        System.out.println(isValid(str));
    }
    private static boolean isValid(String s) {
        Stack<Character> pStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                pStack.push(')');
            } else if (c == '[') {
                pStack.push(']');
            } else if (c == '{') {
                pStack.push('}');
            } else if(pStack.isEmpty() || pStack.pop()!=c){
                return false;
            }
        }
        return pStack.isEmpty();
    }
}

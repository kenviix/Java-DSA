package DSA.practice;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "){";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {
        // with  strings

//        if (s.contains("()")) {
//            s = s.replace("()", "");
//        } else if (s.contains("{}")) {
//            s = s.replace("{}", "");
//        } else if (s.contains("[]")) {
//            s = s.replace("[]", "");
//        }
//        return s.isEmpty();

        // with stack


        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}

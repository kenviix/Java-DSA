package DSA.practice.StacksAndQueues;

import java.util.Stack;

import static DSA.practice.Utilities.priorityInStack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "(p+q)*(c-d)";
        System.out.println(infixToPrefix(s));
    }
    private static String infixToPrefix(String s){
        StringBuilder temp = new StringBuilder(s).reverse();
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '('){
                temp.setCharAt(i,')');
            }else if(temp.charAt(i) == ')'){
                temp.setCharAt(i,'(');
            }

        }
        s = temp.toString();
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        // controlled conversion

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                prefix.append(c);
            }else if(c == '('){
                stack.push('(');
            } else if (c == ')') {
                while(!stack.empty() && stack.peek()!='('){
                    prefix.append(stack.pop());
                }
                stack.pop();
            }else{
                if(c == '^'){
                    while(!stack.empty() && priorityInStack(c) <= priorityInStack(stack.peek())){
                        prefix.append(stack.pop());
                    }
                }else{
                    while(!stack.empty() && priorityInStack(c) < priorityInStack(stack.peek())){
                        prefix.append(stack.pop());
                    }
                }
                stack.push(c);
            }
        }

        while (!stack.empty()){
            prefix.append(stack.pop());
        }

        return prefix.reverse().toString();
    }
}

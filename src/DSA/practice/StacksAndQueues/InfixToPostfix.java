// https://takeuforward.org/data-structure/infix-to-postfix/

package DSA.practice.StacksAndQueues;

import java.util.Stack;

import static DSA.practice.Utilities.priorityInStack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
//        String s = "(p+q)*(m-n)";
        System.out.println(infixToPostfix(s));
    }
    private static String infixToPostfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }else if(c == '('){
                stack.push('(');
            } else if (c == ')') {
                while(!stack.empty() && stack.peek()!='('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while(!stack.empty() && priorityInStack(c) <= priorityInStack(stack.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
}

package org.gula.myleetcode.easy;

import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (containParentheses(ch) && isParentheses(ch, stack.peek())) {
                stack.pop();

            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    private boolean containParentheses(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    private boolean isParentheses(char ch, char peek) {
        return (ch == ')' && peek == '(')
                || (ch == ']' && peek == '[')
                || (ch == '}' && peek == '{');
    }


}

package org.gula.myleetcode.medium;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        char[] chars = S.toCharArray();
        int coef = 1;
        int result = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '(' && chars[i] == chars[i + 1]) {
                coef *= 2;
            } else if (chars[i] == '(' && chars[i + 1] == ')') {
                result = result + coef;
            } else if(chars[i] == ')' && chars[i] == chars[i + 1]){
                coef /= 2;
            }
        }
        return result;
    }
}

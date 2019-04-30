package org.gula.myleetcode.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char ch = chars[i];
            if (ch != ' ') {
                result++;
            } else if (result > 0) {
                break;
            }
        }
        return result;
    }
}

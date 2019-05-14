package org.gula.myleetcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            char charF = chars[l];
            if (!Character.isLetterOrDigit(charF)) {
                l++;
                continue;
            }
            char charE = chars[r];
            if (!Character.isLetterOrDigit(charE)) {
                r--;
                continue;
            }
            if (Character.toLowerCase(charF) != Character.toLowerCase(charE)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

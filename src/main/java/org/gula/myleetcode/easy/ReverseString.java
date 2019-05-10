package org.gula.myleetcode.easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        char ch;
        while (l < r) {
            ch = s[l];
            s[l] = s[r];
            s[r] = ch;
            l++;
            r--;
        }
    }
}

package org.gula.myleetcode.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int result = 0;
        int d = x;
        while (d != 0) {
            result *= 10;
            result += d % 10;
            d /= 10;
        }
        return (result ^ x) == 0;
    }

    public boolean isPalindrome2(int x) {
        final char[] chars = String.valueOf(x).toCharArray();
        int length = chars.length;
        if (length == 1) {
            return true;
        }
        for (int i = 0; i < length; i++, length--) {
            if (chars[i] != chars[length - 1]) {
                return false;
            }
        }
        return true;
    }
}

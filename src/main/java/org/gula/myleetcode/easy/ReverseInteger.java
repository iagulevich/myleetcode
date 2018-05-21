package org.gula.myleetcode.easy;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseInteger {

    public int reverse(int x) {
        long result = 0;
        int d = x;
        while (d != 0) {
            result *= 10;
            result += d % 10;
            d /= 10;
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }

}

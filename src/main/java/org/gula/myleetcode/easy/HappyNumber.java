package org.gula.myleetcode.easy;

public class HappyNumber {

    public boolean isHappy(int n) {
        return is(n, 10);
    }

    private boolean is(int n, int d) {
        if (d == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            result += temp * temp;
            n /= 10;
        }
        return is(result, --d);
    }
}

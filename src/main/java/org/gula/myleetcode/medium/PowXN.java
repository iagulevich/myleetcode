package org.gula.myleetcode.medium;

public class PowXN {
    public double myPow(double x, int n) {
        if (x == 1) {
            return 1;
        }
        if (x == -1) {
            return (n % 2 == 0) ? 1 : -1;
        }
        double result = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
                if (Math.abs(result) < 0.00001) {
                    break;
                }
            }
        } else if (n < 0) {
            for (int i = n; i < 0; i++) {
                result *= 1 / x;
                if (Math.abs(result) < 0.00001) {
                    break;
                }
            }
        }
        return result;
    }

    public double myPow2(double x, int n) {
        long m = n > 0 ? n : -(long) n;
        double ans = 1.0;
        while (m != 0) {
            if ((m & 1) == 1)
                ans *= x;
            x *= x;
            m >>= 1;
        }
        return n >= 0 ? ans : 1 / ans;
    }
}

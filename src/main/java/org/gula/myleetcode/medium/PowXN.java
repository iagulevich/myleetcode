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
}

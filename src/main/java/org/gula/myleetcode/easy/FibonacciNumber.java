package org.gula.myleetcode.easy;

public class FibonacciNumber {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 3; i <= N; i++) {
            int three = first + second;
            first = second;
            second = three;
        }
        return second;
    }
}

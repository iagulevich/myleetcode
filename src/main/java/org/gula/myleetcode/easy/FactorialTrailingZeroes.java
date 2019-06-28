package org.gula.myleetcode.easy;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new FactorialTrailingZeroes().trailingZeroes(13);
        System.out.println(i);
    }
}

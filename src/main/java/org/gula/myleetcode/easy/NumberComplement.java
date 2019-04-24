package org.gula.myleetcode.easy;

public class NumberComplement {
    public int findComplement(int num) {
        int result = 0;
        for (int p = 1; num > 0; num >>= 1, p *= 2) {
            result += p * ((num % 2) ^ 1);
        }
        return result;
    }
}

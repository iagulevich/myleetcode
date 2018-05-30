package org.gula.myleetcode.easy;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        boolean needInc = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (needInc) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    needInc = false;
                }
            }
        }
        if (needInc) {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = 1;
        }
        return digits;
    }
}

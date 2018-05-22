package org.gula.myleetcode.easy;

public class RomanToInt {

    enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        Roman(int value) {
            this.value = value;
        }

        public static Roman value(char ch) {
            return valueOf(ch + "");
        }

        //I can be placed before V (5) and X (10) to make 4 and 9.
        //X can be placed before L (50) and C (100) to make 40 and 90.
        //C can be placed before D (500) and M (1000) to make 400 and 900.
        public static boolean isBefore(Roman prev, Roman current) {
            if (prev == I && (current == V || current == X)) {
                return true;
            }
            if (prev == X && (current == L || current == C)) {
                return true;
            }
            if (prev == C && (current == D || current == M)) {
                return true;
            }
            return false;
        }

    }


    public int romanToInt(String s) {
        int result = 0;
        final char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return Roman.value(chars[0]).value;
        }
        Roman current;
        Roman prev = null;
        for (int i = 0; i < chars.length; i++) {
            current = Roman.value(chars[i]);
            result += current.value;
            if (prev != null && Roman.isBefore(prev, current)) {
                result -= 2 * prev.value;
            }
            prev = current;
        }
        return result;
    }


}

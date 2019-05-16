package org.gula.myleetcode.easy;

import java.util.Arrays;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String s = "";
        int size = Alphabet.getSize();

        while (n > 0) {
            char ch;
            if (n % size == 0) {
                ch = Alphabet.findByValue(size);
                n = n / size - 1;
            } else {
                ch = Alphabet.findByValue(n % size);
                n /= size;
            }
            s = ch + s;
        }
        return s;
    }

    enum Alphabet {
        A('A', 1),
        B('B', 2),
        C('C', 3),
        D('D', 4),
        E('E', 5),
        F('F', 6),
        G('G', 7),
        H('H', 8),
        I('I', 9),
        J('J', 10),
        K('K', 11),
        L('L', 12),
        M('M', 13),
        N('N', 14),
        O('O', 15),
        P('P', 16),
        Q('Q', 17),
        R('R', 18),
        S('S', 19),
        T('T', 20),
        U('U', 21),
        V('V', 22),
        W('W', 23),
        X('X', 24),
        Y('Y', 25),
        Z('Z', 26);

        private final char symbol;
        private final int value;

        Alphabet(char symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public char getSymbol() {
            return this.symbol;
        }

        public static char findByValue(int value) {
            return Arrays.stream(values())
                    .filter(alphabet -> alphabet.value == value)
                    .map(alphabet -> alphabet.symbol)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Symbol not found by value: " + value));
        }

        public static int getSize() {
            return values().length;
        }
    }

    public static void main(String[] args) {
        String result = new ExcelSheetColumnTitle().convertToTitle(1);
        System.out.println("result:" + result);
    }
}

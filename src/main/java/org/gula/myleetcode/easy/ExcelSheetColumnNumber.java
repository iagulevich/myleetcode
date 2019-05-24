package org.gula.myleetcode.easy;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int diff = (int) 'A' - 1; // 64
        final int basis = 26;

        char[] chars = s.toCharArray();
        int result = 0;
        for (int j = chars.length - 1, i = 0; j >= 0; j--) {
            int el = (int) chars[j] - diff;
            result = result + el * (int) Math.pow(basis, i++);
        }
        return result;
    }
}

package org.gula.myleetcode.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        int n = charsA.length;

        char[] charsB = b.toCharArray();
        int m = charsB.length;

        char[] result = new char[Math.max(m, n)];
        int k = Math.max(m, n);

        boolean temp = false;
        for (int i = n - 1, j = m - 1, l = k - 1; i >= 0 || j >= 0; i--, j--, l--) {
            char f = '0';
            if (i >= 0) {
                f = charsA[i];
            }
            char s = '0';
            if (j >= 0) {
                s = charsB[j];
            }


            if (f == '0' && s == '0' && !temp) {
                result[l] = '0';
                temp = false;
            } else if ((f == '1' && s == '0' && !temp) ||
                    (f == '0' && s == '1' && !temp) ||
                    (f == '0' && s == '0' && temp)) {
                result[l] = '1';
                temp = false;
            } else if ((f == '1' && s == '1' && !temp) ||
                    (f == '1' && s == '0' && temp) ||
                    (f == '0' && s == '1' && temp)) {
                result[l] = '0';
                temp = true;
            } else if (f == '1' && s == '1' && temp) {
                result[l] = '1';
                temp = true;
            }
        }
        return (temp) ? '1' + new String(result) : new String(result);
    }
}

package org.gula.myleetcode.easy;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        Arrays.sort(a);

        char[] b = t.toCharArray();
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}

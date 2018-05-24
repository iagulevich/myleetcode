package org.gula.myleetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if (strs.length == 0) {
            return prefix;
        }

        if (strs.length == 1) {
            return strs[0];
        }
        int minLength = Arrays.stream(strs).min(Comparator.comparing(String::length)).get().length();


        while (minLength > 0) {
            if (isPrefix(strs, minLength)) {
                prefix = strs[0].substring(0, minLength);
                break;
            } else {
                minLength--;
            }
        }
        return prefix;
    }

    private boolean isPrefix(String[] strs, int minLength) {
        String def;
        String defNext;
        for (int i = 0; i < strs.length - 1; i++) {
            def = strs[i].substring(0, minLength);
            defNext = strs[i + 1].substring(0, minLength);
            if (!def.equals(defNext)) {
                return false;
            }
        }
        return true;
    }


}

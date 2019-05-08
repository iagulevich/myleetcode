package org.gula.myleetcode.medium;

import java.util.List;

public class LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String dic : d) {
            if (isSubsequence(dic, s)) {
                if (dic.length() > result.length() ||
                        (dic.length() == result.length() && dic.compareTo(result) < 0)) {
                    result = dic;
                }
            }
        }
        return result;
    }

    private boolean isSubsequence(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++) {
            if (x.charAt(j) == y.charAt(i)) {
                j++;
            }
        }
        return j == x.length();
    }
}

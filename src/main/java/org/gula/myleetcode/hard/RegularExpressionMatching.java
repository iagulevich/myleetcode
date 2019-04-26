package org.gula.myleetcode.hard;

/**
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * Note:
 *
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 *
 * Example 1:
 *
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 *
 * Example 2:
 *
 * Input:
 * s = "aa"
 * p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 *
 * Example 3:
 *
 * Input:
 * s = "ab"
 * p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 * Example 4:
 *
 * Input:
 * s = "aab"
 * p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
 *
 * Example 5:
 *
 * Input:
 * s = "mississippi"
 * p = "mis*is*p*."
 * Output: false
 */
public class RegularExpressionMatching {

    public boolean isMatch(String string, String pattern) {
        char[] patterns = pattern.toCharArray();
        char[] strings = string.toCharArray();
        int i = 0;
        int j = 0;
        boolean star = false;
        while (i < strings.length && j < patterns.length) {
            char s = strings[i];
            char p = patterns[j];
            if (star) {
                if (j + 1 < patterns.length && (patterns[j + 1] == s || patterns[j + 1] == '.')) {
                    if (patterns[j + 1] == '.'){
                        i++;
                    }
                    star = false;
                    j = j + 2;
                    i++;
                    continue;
                }
                i++;
            }
            if (p == '.' || p == s) {
                i++;
                j++;
            } else if (p == '*') {
                star = true;
            } else {
                if (j + 1 < patterns.length && patterns[j + 1] == '*') {
                    j++;
                } else {
                    return false;
                }
            }
        }
        if (star) {
            j++;
        }
        return i < strings.length == j < patterns.length;
    }
}
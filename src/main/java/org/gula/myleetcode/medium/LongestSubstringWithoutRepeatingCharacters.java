package org.gula.myleetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        if (s != null && s.length() != 0) {
            List<Character> uniqueChars = new ArrayList<>(s.length());
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                int indexOf = uniqueChars.indexOf(c);
                if (indexOf >= 0) {
                    length = getLength(uniqueChars, length);
                    for (int i = indexOf; i >= 0; i--) {
                        uniqueChars.remove(i);
                    }
                }
                uniqueChars.add(c);
            }
            length = getLength(uniqueChars, length);
        }
        return length;
    }

    private int getLength(List<Character> uniqueChars, int length) {
        int size = uniqueChars.size();
        if (size > length) {
            length = size;
        }
        return length;
    }
}

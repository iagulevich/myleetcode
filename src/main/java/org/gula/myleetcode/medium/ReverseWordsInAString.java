package org.gula.myleetcode.medium;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        if (words.length < 1) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i].trim()).append(" ");
        }
        return result.toString().trim();
    }
}

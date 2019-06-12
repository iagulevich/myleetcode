package org.gula.myleetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        int n = pattern.length();
        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");
        int m = words.length;
        if (n != m) {
            return false;
        }
        Map<String, String> map = new HashMap<>(n);
        Map<String, String> map1 = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            if (map.get(chars[i] + "") != null) {
                if (!map.get(chars[i] + "").equals(words[i])) {
                    return false;
                }
            } else {
                map.put(chars[i] + "", words[i]);
            }

            if (map1.get(words[i]) != null) {
                if (!map1.get(words[i]).equals(chars[i] + "")) {
                    return false;
                }
            } else {
                map1.put(words[i], chars[i] + "");
            }
        }
        return true;
    }
}

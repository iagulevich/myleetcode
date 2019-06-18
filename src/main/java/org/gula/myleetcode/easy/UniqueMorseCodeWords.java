package org.gula.myleetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    private static Map<String, String> codes = new HashMap<>(26);

    static {
        codes.put("a", ".-");
        codes.put("b", "-...");
        codes.put("c", "-.-.");
        codes.put("d", "-..");
        codes.put("e", ".");
        codes.put("f", "..-.");
        codes.put("g", "--.");
        codes.put("h", "....");
        codes.put("i", "..");
        codes.put("j", ".---");
        codes.put("k", "-.-");
        codes.put("l", ".-..");
        codes.put("m", "--");
        codes.put("n", "-.");
        codes.put("o", "---");
        codes.put("p", ".--.");
        codes.put("q", "--.-");
        codes.put("r", ".-.");
        codes.put("s", "...");
        codes.put("t", "-");
        codes.put("u", "..-");
        codes.put("v", "...-");
        codes.put("w", ".--");
        codes.put("x", "-..-");
        codes.put("y", "-.--");
        codes.put("z", "--..");
    }

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morse = new HashSet<>(words.length);
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char ch : chars) {
                sb.append(codes.get(ch + ""));
            }
            morse.add(sb.toString());
        }
        return morse.size();
    }
}

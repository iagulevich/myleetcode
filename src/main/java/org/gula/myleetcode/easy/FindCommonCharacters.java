package org.gula.myleetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        for (char ch : A[0].toCharArray()) {
            if (consistInAll(ch, A)) {
                list.add(ch + "");
            }
        }
        return list;
    }

    private boolean consistInAll(char ch, String[] array) {
        for (int i = 1; i < array.length; i++) {
            if (!consist(ch, array[i].toCharArray())) {
                return false;
            }
        }
        return true;
    }

    private boolean consist(char ch, char[] chars) {
        for (char c : chars) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}

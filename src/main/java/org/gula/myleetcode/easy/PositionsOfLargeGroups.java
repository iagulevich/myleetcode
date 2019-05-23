package org.gula.myleetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        int start = -1;
        char[] chars = S.toCharArray();
        char ch = chars[0];
        int count = 1;
        List<List<Integer>> result = new ArrayList<>();
        int i = 1;
        while (i < chars.length) {
            if (ch == chars[i]) {
                if (start == -1) {
                    start = i - 1;
                }
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i - 1);
                    result.add(list);
                }
                start = -1;
                count = 1;
                ch = chars[i];
            }
            i++;
        }
        if (count >= 3) {
            List<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(i - 1);
            result.add(list);
        }
        return result;
    }
}

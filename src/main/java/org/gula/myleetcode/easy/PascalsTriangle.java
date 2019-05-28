package org.gula.myleetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> row = null;
        for (int i = 1; i <= numRows; i++) {
            row = generateRow(row, i);
            result.add(row);
        }
        return result;
    }

    private List<Integer> generateRow(List<Integer> prev, int num) {
        List<Integer> row = new ArrayList<>(num);
        if (prev == null) {
            row.add(1);
        } else if (prev.size() == 1) {
            row.add(1);
            row.add(1);
        } else {
            row.add(1);
            for (int j = 0; j < prev.size() - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }
            row.add(1);
        }
        return row;
    }
}

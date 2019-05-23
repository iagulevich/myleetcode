package org.gula.myleetcode.easy;

public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int[] op = new int[]{m, n};
        for (int[] ints : ops) {
            op = merge(op, ints);
        }
        return op[0] * op[1];
    }

    private int[] merge(int[] min, int[] a) {
        return new int[]{Math.min(min[0], a[0]), Math.min(min[1], a[1])};
    }
}

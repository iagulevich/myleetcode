package org.gula.myleetcode.easy;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c != nums.length * nums[0].length){
            return nums;
        }
        int[][] result = new int[r][c];
        int n = 0;
        int m = 0;
        for (int[] num : nums) {
            for (int element : num) {
                if (m >= c) {
                    m = 0;
                    n++;
                }
                result[n][m] = element;
                m++;
            }
        }
        return result;
    }
}

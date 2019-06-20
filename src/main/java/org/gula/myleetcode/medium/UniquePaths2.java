package org.gula.myleetcode.medium;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length - 1;
        int n = obstacleGrid[0].length - 1;
        int[][] r = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    r[i][j] = 0;
                    continue;
                }
                if (j - 1 < 0 && i - 1 < 0){
                    r[i][j] = 1;
                } else {
                    int l = (j - 1 >= 0) ? r[i][j - 1] : 0;
                    int t = (i - 1 >= 0) ? r[i - 1][j] : 0;
                    r[i][j] = l + t;
                }
            }
        }
        return r[m][n];
    }

    public static void main(String[] args) {
        int[][] in = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int result = new UniquePaths2().uniquePathsWithObstacles(in);
        System.out.println(result);
    }
}

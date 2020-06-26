/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/21 20:45
 */

public class _63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m-1][n-1] == 1) return 0;
        int[][] path = new int[m][n];

        for (int i = m-1; i >= 0; i--) {
            if (obstacleGrid[i][n - 1] == 1) break;
            path[i][n - 1] = 1;
        }
        for (int i = n-1; i >=0; i--) {
            if (obstacleGrid[m - 1][i] == 1) break;
            path[m - 1][i] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 0) {
                    path[i][j] = path[i + 1][j] + path[i][j + 1];
                } else {
                    path[i][j] = 0;
                }
            }
        }

        return path[0][0];
    }
}

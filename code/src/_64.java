
//最小路径和
public class _64 {

    /*
    状态空间：d[i][j]  到达[i][j]位置的最小路径和
    状态方程：
    i != 0 && j!= 0 d[i][j] = min(d[i][j-1],d[i-1][j]) + nums[i][j]
    i = 0 && j != 0 d[i][j] = d[i][j] + nums[i][j]
    i != 0 && j= 0  d[i][j] = d[i-1][j] + nums[i][j]
    i = 0 && j= 0 d[i][j] = nums[i][j]
     */
    public int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid == null) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 && j==0) dp[i][j] = grid[i][j];
                else if (i == 0 && j != 0) dp[i][j] = dp[i][j - 1] + grid[i][j];
                else if (i != 0 && j==0) dp[i][j] = dp[i - 1][j] + grid[i][j];
                else dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[m - 1][n - 1];

    }
}

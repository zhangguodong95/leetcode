import org.junit.Test;

import java.util.List;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/22 11:40
 */

/*
dp公式
dp[i][j] = min(dp[i+1][j],dp[i+1][j+1]) + dp[i][j]
 */
public class _120 {


    public int minimumTotal(List<List<Integer>> triangle) {
        //时间复杂度是o(m*n) 空间复杂度o(m*n)
        if (triangle == null || triangle.isEmpty()) return 0;
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int[][] dp = new int[m][n];

        int k = 0;
        for (Integer integer : triangle.get(n - 1)) {
            dp[m - 1][k++] = integer;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }

        return dp[0][0];
    }

    public int minimumTotal_1(List<List<Integer>> triangle) {
        //空间复杂度是O(n)
        if (triangle.isEmpty()) return 0;
        int m = triangle.size();
        int[] dp = new int[m];
        int k = 0;
        for (Integer integer : triangle.get(m - 1)) {
            dp[k++] = integer;
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {//必须是从前向后递推 因为前面的要使用后面的 后面的不能先更新
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}

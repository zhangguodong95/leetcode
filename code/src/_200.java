import org.junit.Test;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/3 17:04
 */

//岛屿数量
public class _200 {
    //扫描整个二维数组，如果碰到1就将其周围所有的值都设置为0
    //一直到整个图都变成0为止
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};//向量

    @Test
    public void test() {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int res = numIslands(grid);
        System.out.println(res);
    }

    public int numIslands(char[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '0') {
                    continue;
                } else {
                    dfs(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }

    public int dfs(char[][] grid, int i, int j) {//数组，值为1的点的坐标
        //terminal
        if (grid[i][j] == '0') return 0;
        //process current logic
        grid[i][j] = '0';
        //drill down
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[i].length) {
                if (grid[x][y] == '0') continue;
                else dfs(grid, x, y);
            }

        }
        return 1;
    }
}

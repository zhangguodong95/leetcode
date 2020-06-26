//robotSim

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class _874 {
    @Test
    public void test() {
        int[] commands = {4, -1, 3};
        int[][] obstacles = {};
        int res = robotSim(commands, obstacles);
        System.out.println(res);
    }
    //模拟智能机器人
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<String>();
        //d控制方向 c表示指令
        int d = 0, x = 0, y = 0, result = 0;
        for (int[] obstacle : obstacles) {
            //将障碍物存入容器中
            set.add(obstacle[0] + "," + obstacle[1]);
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int c : commands) {
            if (c == -1) {
                //先自加再进行判断 能够避免写 if else 语句
                d++;
                if (d == 4) d = 0;
            } else if (c == -2) {
                d--;
                if (d == -1) d = 3;
            } else {
                while (c-- > 0 && !set.contains((x + dirs[d][0]) + "," + (y + dirs[d][1]))) {
                    x += dirs[d][0];
                    y += dirs[d][1];
                }
            }
            //寻找最大值
            result = Math.max(result, x * x + y * y);
        }
        return result;
    }
}

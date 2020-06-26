import org.junit.Test;

//jump-game-ii
public class _45 {
    @Test
    public void test() {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
    //跳跃游戏 2
    public int jump(int[] nums) {
        //起跳就一定会落地
        int curFarthest = 0, curEnd = 0, jump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + nums[i]);
            if (i == curEnd) {
                jump++;
                curEnd = curFarthest;
            }
        }
        return jump;
    }
}

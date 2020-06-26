//jump-game
public class _55 {
    public boolean canJump(int[] nums) {
        int end = nums.length - 1;
        int endReachable = end;

        for (int i = end; i >= 0; i--) {
            if (nums[i] + i >= endReachable) {
                endReachable = i;
            }
        }
        return endReachable == 0;
    }
}

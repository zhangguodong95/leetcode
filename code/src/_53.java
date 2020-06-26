import java.util.Arrays;

//最大子序列和
public class _53 {
    public int maxSubArray(int[] nums) {
        int[] db = new int[nums.length];
        db[0] = nums[0];
        int result = db[0];

        for (int i = 1; i < db.length; i++) {
            db[i] = Math.max(db[i - 1], 0) + nums[i];
            result = Math.max(db[i], result);
        }

        return result;
    }
}

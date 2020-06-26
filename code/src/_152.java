
public class _152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        int result = nums[0], max = nums[0], min = nums[0];
        //max 保存的是包含i位置的最大值  result 保存的是所有情况的最大值
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);//找最大值
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);//找最小值
            result = Math.max(result, max);
        }

        return result;
    }
}

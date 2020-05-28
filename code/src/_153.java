/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/25 15:26
 */
public class _153 {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //寻找 left == mid == right的点 就是要找的最小点
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;//无序在右边 且一定不是mid点
            } else {
                right = mid;//无序在左边 有可能是mid点
            }
        }
        return left;
    }
}

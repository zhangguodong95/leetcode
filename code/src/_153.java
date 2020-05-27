/**
 * @author zgd
 * @version 1.0
 * @date 2020/5/25 15:26
 */
public class _153 {
    //方法一
//    public int findMin(int[] nums) {
//        //特殊情况
//        if (nums.length == 1) {
//            return nums[0];
//        }
//        int start = 0;
//        int end = nums.length - 1;
//        //没有旋转的情况
//        if (nums[start] < nums[end]) {
//            return nums[start];
//        }
//        //有旋转
//        while (start <= end) {
//            int mid = (start + end) >> 1;
//            //判断mid是否是旋转点
//            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
//            if (nums[mid - 1] > nums[mid]) return nums[mid];
//            //寻找旋转点所在的区域
//            if (nums[0] < nums[mid]) {
//                start = mid ;
//            } else {
//                end = mid;
//            }
//        }
//        return -1;
//    }

    /**
     * 方法二
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            if (nums[mid] < nums[right]) {
                right = mid;
            }
        }

        if (left == right) return left;
        return -1;
    }
}

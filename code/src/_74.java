
public class _74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid/cols][mid%cols] == target) return true;
            else if (matrix[mid/cols][mid%cols] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
   }
//    public boolean searchMatrix(int[][] matrix, int target) {
//        //特殊情况判断
//        if(matrix.length == 0 || matrix == null) return false;
//        //将二维数组变成一维数组
//        int[] nums = new int[matrix.length * matrix[0].length];
//        //遍历数组
//        int k = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                nums[k++] = matrix[i][j];
//            }
//        }
//
//        int left = 0, right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) return true;
//            else if (nums[mid] < target) left = mid + 1;
//            else right = mid - 1;
//        }
//        return false;
//    }
}

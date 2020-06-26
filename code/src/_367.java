import org.junit.Test;

public class _367 {

    @Test
    public void test() {
        boolean perfectSquare = isPerfectSquare(5);
        System.out.println(perfectSquare);
    }

    public boolean isPerfectSquare(int num) {

//        if (num == 0 || num == 1) return true;
//        int left = 0, right = num;
//        while (left <= right) {
//           long mid = left + (right - left) / 2;
//            if (mid * mid == num) return true;
//            else if (mid * mid < num) left =(int) mid + 1;
//            else right = (int)mid - 1;
//        }
//
//        return false;
        int i = 1;
        while (num > 0) {
            num = num - i;
            i += 2;
        }
       return num == 0;
    }
}

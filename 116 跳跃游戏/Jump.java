/**
 * Created by Silocean on 2016-05-06.
 */
public class Jump {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{4, 6, 9, 5, 9, 3, 0}));
    }

    public static boolean canJump(int[] A) {
        // write your code here
        int i = 0;
        int step = A[0];
        boolean flag = false;
        while (i <= A.length - 1) {
            if (step >= A.length - i - 1) {
                flag = true;
                break;
            } else {
                int t = i;
                int max = 0;
                int min = 0;
                for (int j = t + 1; j <= t + step; j++) {
                    if (A[j] >= max) {
                        max = A[j];
                        i = j;
                    }
                    if (A[j] < min) {
                        min = A[j];
                    }
                }
                if (max == min) {
                    i = t;
                    i += step;
                }
                step = max;
                if (step == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

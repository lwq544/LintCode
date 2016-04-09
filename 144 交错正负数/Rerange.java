import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-09.
 */
public class Rerange {

    public static void main(String[] args) {
        rerange(new int[]{-33, -19, 30, 26, 21, -9});
    }

    /**
     * @param A: An integer array.
     * @return: void
     */
    public static void rerange(int[] A) {
        Arrays.sort(A);
        if (A.length <= 2) {
            return;
        }

        if (A.length % 2 == 0) { // 正负个数相等
            int start = 1;
            int end = A.length - 2;
            while (start < end) {
                swap(A, start, end);
                start += 2;
                end -= 2;
            }
        } else if (A[A.length / 2] > 0) { // 正数个数多于负数
            int start = 0;
            int end = A.length - 2;
            while (start < end) {
                swap(A, start, end);
                start += 2;
                end -= 2;
            }
        } else { // 正数个数小于负数
            int start = 1;
            int end = A.length - 1;
            while (start < end) {
                swap(A, start, end);
                start += 2;
                end -= 2;
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }


    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

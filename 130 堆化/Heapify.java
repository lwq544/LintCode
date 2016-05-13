/**
 * Created by Silocean on 2016-05-13.
 */
public class Heapify {
    public static void main(String[] args) {
        int[] A = {45, 39, 32, 11};
        heapify(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    /**
     * @param A: Given an integer array
     * @return: void
     */
    public static void heapify(int[] A) {
        // write your code here
        int N = A.length - 1;
        for (int k = N % 2 == 0 ? N / 2 - 1 : N / 2; k >= 0; k--) { // 堆的构造
            sink(A, k, N);
        }
    }

    private static void sink(int[] A, int k, int n) {
        while (k * 2 + 1 <= n) {
            int j = k * 2 + 1;
            if (j < n && more(A, j, j + 1)) j++;
            if (!more(A, k, j)) break;
            exch(A, k, j);
            k = j;
        }
    }

    private static boolean more(int[] A, int i, int j) {
        return A[i] > A[j];
    }

    private static void exch(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}

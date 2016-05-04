/**
 * 归并排序
 * Created by Silocean on 2016-04-24.
 */
public class ReversePairs {

    private static int[] aux;

    private static int count = 0;
    /**
     * @param A an array
     * @return total of reverse pairs
     */
    public long reversePairs(int[] A) {
        // Write your code here
        aux = new int[A.length];
        sort(A, 0, A.length - 1);
        return count;
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
                // 因为此时数组已有序
                // 所以如果aux[i]此时比右数组的当前元素aux[j]大，
                // 那么左数组中aux[i]后面的元素就都比aux[j]大
                count += mid - i + 1;
            } else {
                a[k] = aux[i++];
            }
        }
    }

    private static boolean less(int v, int w) {
        return v < w;
    }
}

/**
 * Created by Silocean on 2016-04-08.
 */
public class FirstMissingPositive {

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{5, 7, 3, 2, 1}));
    }

    /**
     * @param A: an array of integers
     * @return: an integer
     */
    public static int firstMissingPositive(int[] A) {
        for (int i = 0; i < A.length;) {
            if (A[i] <= 0 || A[i] == i + 1 || A[i] > A.length || A[i] == A[A[i] - 1]) {
                i++;
            } else {
                int temp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}

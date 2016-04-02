/**
 * Created by Silocean on 2016-04-02.
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 2, 1, 3, 4, 3}));
    }

    public static int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int n = A[0];
        for (int i = 1; i < A.length; i++) {
            n = n ^ A[i];
        }

        return n;
    }
}

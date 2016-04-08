import java.text.DecimalFormat;

/**
 * Created by Silocean on 2016-04-08.
 */
public class CosineSimilarity {
    public static void main(String[] args) {
        int[] A = {0};
        int[] B = {0};
        System.out.println(cosineSimilarity(A, B));
    }

    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public static double cosineSimilarity(int[] A, int[] B) {

        double result = 0d;

        if (A.length != B.length || A.length == 0 || B.length == 0) {
            result = 2d;
        } else {
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < A.length; i++) {
                a += A[i] * B[i];
                b += A[i] * A[i];
                c += B[i] * B[i];
            }
            if (b == 0 || c == 0) {
                result = 2d;
            } else {
                result = a / (Math.sqrt(b) * Math.sqrt(c));
            }

        }
        DecimalFormat format = new DecimalFormat("#.0000");
        return Double.parseDouble(format.format(result));
    }
}

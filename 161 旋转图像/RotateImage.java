/**
 * Created by Silocean on 2016-05-04.
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param matrix: A list of lists of integers
     * @return: Void
     */
    public static void rotate(int[][] matrix) {
        // write your code here
        int length = matrix.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < (length + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = matrix[length - i - 1][length - j - 1];
                matrix[length - i - 1][length - j - 1] = matrix[j][length - i - 1];
                matrix[j][length - i - 1] = temp;
            }
        }
    }
}

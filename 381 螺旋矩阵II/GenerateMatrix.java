/**
 * Created by Silocean on 2016-04-01.
 */
public class GenerateMatrix {

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(0);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        if (n <= 0) return new int[0][0];
        int[][] matrix = new int[n][n];
        helper(0, n, 1, matrix);
        return matrix;
    }

    public static void helper(int row, int length, int start, int[][] matrix) {
        for (int i = 0; i < length; i++) {
            matrix[row][row + i] = start;
            start++;
        }
        for (int i = 1; i < length; i++) {
            matrix[row + i][row + length - 1] = start;
            start++;
        }
        for (int i = length - 2; i >= 0; i--) {
            matrix[row + length - 1][row + i] = start;
            start++;
        }
        for (int i = length - 2; i > 0; i--) {
            matrix[row + i][row] = start;
            start++;
        }
        if (length == 1 || length == 2)
            return;
        helper(row + 1, length - 2, start, matrix);
    }

}

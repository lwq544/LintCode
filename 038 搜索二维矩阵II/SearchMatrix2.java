/**
 * Created by Silocean on 2016-03-30.
 */
public class SearchMatrix2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {2, 4, 7, 8}, {3, 5, 9, 10}};
        System.out.println(searchMatrix(matrix, 3));
    }

    public static int searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return 0;
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = cols - 1;
        while (i < rows && j >= 0) {
            if (target == matrix[i][j]) {
                count++;
                j--;
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}

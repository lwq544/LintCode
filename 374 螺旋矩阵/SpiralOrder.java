import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silocean on 2016-04-01.
 */
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        List<Integer> al = spiralOrder(matrix);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    public static List<Integer> list = new ArrayList<>();

    public static List<Integer> spiralOrder(int[][] matrix) {
        // Write your code here
        int height = matrix.length;
        if (height == 0) {
            return list;
        }
        int width = matrix[0].length;
        helper(0, width, height, matrix);
        return list;
    }

    public static void helper(int index, int width, int height, int[][] matrix) {
        if (width <= 0 || height <= 0) return;
        for (int i = 0; i < width; i++) {
            list.add(matrix[index][index + i]);
        }
        for (int i = 1; i < height; i++) {
            list.add(matrix[index + i][index + width - 1]);
        }
        for (int i = width - 2; i >= 0; i--) {
            list.add(matrix[index + height - 1][index + i]);
        }
        for (int i = height - 2; i > 0; i--) {
            list.add(matrix[index + i][index]);
        }
        helper(index + 1, width - 2, height - 2, matrix);
    }

}

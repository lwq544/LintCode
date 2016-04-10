import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-10.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 99, 1, 4, 4, 4, 5, 1, 0, -1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> lists = threeSum(numbers);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }
        //System.out.println(binarySearch(numbers, 2));
    }

    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        Arrays.sort(numbers);

        ArrayList<int[]> temp = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!contains(temp, numbers[i], numbers[j])) {
                    temp.add(new int[]{numbers[i], numbers[j]});
                } else { // 如果包含正在处理的这两个数，跳过下面步骤，不对这重复的两个数做任何处理
                    continue;
                }
                int k = binarySearch(numbers, -numbers[i] - numbers[j], j + 1);
                if (k != -1) { // 如果找到第三个数，把它加入到lists中去
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(numbers[i]);
                    list.add(numbers[j]);
                    list.add(numbers[k]);
                    lists.add(list);
                }
            }
        }

        return lists;
    }

    /**
     * 判断当前的两数组合之中是否包含正在处理的两个数，如果包含返回true
     *
     * @param temp
     * @param x
     * @param y
     * @return
     */
    public static boolean contains(ArrayList<int[]> temp, int x, int y) {
        for (int i = 0; i < temp.size(); i++) {
            if (x == temp.get(i)[0] && y == temp.get(i)[1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 二分查找与前两个数之和相反的数
     *
     * @param numbers
     * @param x
     * @param j       这个变量很重要，表示要从这个j之后的数字中找，这样避免重复
     * @return
     */
    public static int binarySearch(int[] numbers, int x, int j) {
        int start = j;
        int end = numbers.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (x < numbers[mid]) {
                end = mid - 1;
            } else if (x > numbers[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

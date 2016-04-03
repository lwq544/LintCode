import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-03.
 */
public class Permute {

    public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        permute(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(0).size(); j++) {
                System.out.print(result.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }

    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        if (nums == null) {
            return result;
        }
        arrange(nums, nums.size(), 0);
        return result;
    }

    private static void arrange(ArrayList<Integer> nums, int n, int k) {
        if (n == k) {
            ArrayList<Integer> list = new ArrayList<>(nums);
            result.add(list);
        } else {
            for (int i = k; i < n; i++) {
                swap(nums, k, i);
                arrange(nums, n, k + 1);
                swap(nums, i, k);
            }
        }
    }

    private static void swap(ArrayList<Integer> nums, int x, int y) {
        int temp = nums.get(x);
        nums.set(x, nums.get(y));
        nums.set(y, temp);
    }

}

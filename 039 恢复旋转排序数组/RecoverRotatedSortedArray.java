import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Silocean on 2016-04-01.
 */
public class RecoverRotatedSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        recoverRotatedSortedArray(nums);
    }

    public static void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        while (nums.get(0) >= nums.get(nums.size()-1)) {
            int temp = nums.remove(0);
            nums.add(temp);
        }
        /*for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }*/
    }
}

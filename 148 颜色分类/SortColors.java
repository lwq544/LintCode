import java.util.LinkedList;

/**
 * Created by Silocean on 2016-04-05.
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 2, 1, 2, 2, 1, 2, 0, 0, 0, 1};
        sortColors2(nums);
        printNums(nums);
    }

    public static void sortColors(int[] nums) {
        // write your code here
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list.addFirst(0);
            } else if (nums[i] == 1) {
                list.addLast(1);
            }
        }
        int length = list.size();
        for (int i = 0; i < nums.length - length; i++) {
            list.addLast(2);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }

    public static void sortColors2(int[] nums) {
        if (nums.length <= 1) return;

        int pl = 0;
        int pr = nums.length - 1;
        int i = 0;
        while (i <= pr) {
            if (nums[i] == 0) { // 如果是0，把它向前交换
                swap(nums, i, pl);
                pl++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else { // 如果是2，把它向后交换
                swap(nums, i, pr);
                pr--;
            }
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

}

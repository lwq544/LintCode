/**
 * Created by Silocean on 2016-03-30.
 */
public class FindMin {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 0, 1};
        System.out.println(findMin(arr));
    }

    /**
     * 二分查找
     *
     * @param num
     * @return
     */
    public static int findMin(int[] num) {
        // write your code here
        int l = 0;
        int r = num.length - 1;
        if (num[l] < num[r]) return num[l];
        while (l < r) {
            int mid = (l + r) / 2;
            if (num[mid] > num[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return num[l];
    }
}

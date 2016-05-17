/**
 * Created by Silocean on 2016-05-16.
 */
public class LargestNumber {

    public static void main(String[] args) {
        int[] num = {32, 321};
        System.out.printf(largestNumber(num));
        System.out.println();
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    /**
     * @param num: A list of non negative integers
     * @return: A string
     */
    public static String largestNumber(int[] num) {
        // write your code here
        sort(num, 0, num.length - 1);
        String result = "";
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        if (result.charAt(0) == '0') {
            return "0";
        }
        return result;
    }

    private static void sort(int[] num, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(num, lo, hi);
        sort(num, lo, j - 1);
        sort(num, j + 1, hi);
    }

    private static int partition(int[] num, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = num[lo];
        while (true) {
            while (more(num[++i], v)) {
                if (i == hi) break;
            }
            while (more(v, num[--j])) {
                if (j == lo) break;
            }
            if (i >= j) break;
            exch(num, i, j);
        }
        exch(num, lo, j);
        return j;
    }

    private static boolean more(int a, int b) {
        String s1 = a + "";
        String s2 = b + "";
        return (s1 + s2).compareTo(s2 + s1) > 0;
    }

    private static void exch(int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
}

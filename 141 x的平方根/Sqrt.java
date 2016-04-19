/**
 * Created by Silocean on 2016-04-19.
 */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt2(10));
    }

    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public static int sqrt(int x) {
        // write your code here
        long start = 1;
        long end = x;
        while (start + 1 < end) {
            long mid = (start + end) / 2;
            if (mid * mid <= x) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (end * end <= x) return (int) end;
        return (int) start;
    }

    /**
     * 牛顿迭代法
     *
     * @param x
     * @return
     */
    public static int sqrt2(int x) {
        //if (x < 0) return Double.NaN;
        double err = 1e-15;
        double t = x;
        while (Math.abs(t - x / t) > err * t) {
            t = (x / t + t) / 2.0;
        }
        // return t;
        return (int) t;
    }
}

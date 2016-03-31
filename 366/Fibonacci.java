/**
 * Created by Silocean on 2016-03-30.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci2(10));
    }

    /**
     * 递归解法
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * 非递归解法
     *
     * @param n
     * @return
     */
    public static int fibonacci2(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else {
            for (int i = 1; i <= n - 2; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}

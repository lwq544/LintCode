/**
 * Created by Silocean on 2016-03-31.
 */
public class FastPower {
    public static void main(String[] args) {
        System.out.println(fastPower2(2, 2147483647, 2147483647));
    }

    public static int fastPower(int a, int b, int n) {
        String binary = Integer.toBinaryString(n);
        int result = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result = result * (int) (Math.pow(a, Math.pow(2, i)) % b);
            }
        }
        return result % b;
    }

    /**
     * 不懂
     *
     * @param a
     * @param b
     * @param n
     * @return
     */
    public static int fastPower2(int a, int b, int n) {
        if (n == 1) {
            return a % b;
        }
        if (n == 0) {
            return 1 % b;
        }

        long product = fastPower(a, b, n / 2);
        product = (product * product) % b;
        if (n % 2 == 1) {
            product = (product * a) % b;
        }
        return (int) product;
    }
}

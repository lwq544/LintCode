/**
 * Created by Silocean on 2016-04-01.
 */
public class CheckPowerOf2 {
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(5));
    }

    public static boolean checkPowerOf2(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}

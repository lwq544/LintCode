/**
 * Created by Silocean on 2016-04-03.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1234567899));
    }

    public static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int temp = num * 10 + (x % 10);
            x = x / 10;
            if (temp / 10 != num) {
                num = 0;
                break;
            }
            num = temp;
        }
        return num;
    }

}

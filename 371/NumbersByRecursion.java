import java.util.LinkedList;
import java.util.List;

/**
 * Created by Silocean on 2016-03-30.
 */
public class NumbersByRecursion {

    public static void main(String[] args) {
        List<Integer> list = numbersByRecursion(5);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> numbersByRecursion(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        if (n <= 0) return list;
        else if (n == 1) {
            for (int i = 1; i < 10; i++) {
                list.add(i);
            }
            return list;
        } else {
            List<Integer> temp = numbersByRecursion(n - 1);
            for (int x : temp) { // 把temp复制到list中
                list.add(x);
            }
            for (int i = 1; i < 10; i++) {
                list.add((int) (Math.pow(10, n - 1) * i));
                for (int x : temp) {
                    list.add((int) (Math.pow(10, n - 1) * i + x));
                }
            }
            return list;
        }
    }


}

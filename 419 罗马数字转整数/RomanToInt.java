import java.util.HashMap;
import java.util.Map;

/**
 * Created by Silocean on 2016-04-03.
 */
public class RomanToInt {
    public static void main(String[] args) {
        init();
        System.out.println(romanToInt("XII"));
    }

    public static Map<Character, Integer> map = new HashMap<>();

    /**
     * @param str Roman representation
     * @return an integer
     */
    public static int romanToInt(String str) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int temp = i + 1;
            if (temp == str.length()) {
                sum += map.get(c);
            } else {
                if (map.get(c) < map.get(str.charAt(temp))) {
                    sum += (-1) * map.get(c);
                } else {
                    sum += map.get(c);
                }
            }
        }
        return sum;
    }

    private static void init() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
}

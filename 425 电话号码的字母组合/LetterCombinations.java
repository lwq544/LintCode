package letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Silocean on 2016-06-01.
 */
public class LetterCombinations {

    public static Map<Character, String> map = new HashMap<>();

    static {
        map.put('0', "");
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public static void main(String[] args) {
        ArrayList<String> result = letterCombinations("239");
        for (String str: result) {
            System.out.println(str);
        }
    }

    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public static ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        ArrayList<String> result = new ArrayList<>();
        if(digits == null || digits.equals("")) {
            return result;
        }
        StringBuilder sb = new StringBuilder();
        helper(map, digits, sb, result);
        return result;
    }

    public static void helper(Map<Character, String> map, String digits, StringBuilder sb, ArrayList<String> list) {
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        }
        String str = map.get(digits.charAt(sb.length()));
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            helper(map, digits, sb, list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

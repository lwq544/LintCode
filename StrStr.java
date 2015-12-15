/**
 * Created by Silocean on 2015-12-14.
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中
 * 找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。
 * 样例
 * 如果 source = "source" 和 target = "target"，返回 -1。
 * <p>
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 */
public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr("a", ""));
    }

    public static int strStr(String source, String target) {
        if (source != null && target != null) {
            for (int i = 0; i <= source.length() - target.length(); i++) {
                if (source.substring(i, i + target.length()).equals(target)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

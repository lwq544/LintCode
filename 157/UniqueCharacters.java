public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        boolean flag = true;
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i=0; i<str.length(); i++) {
            if(!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            } else {
                flag = false;
            }
        }
        return flag;
    }
}

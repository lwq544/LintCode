public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        boolean flag = true;
        if(s.length()==t.length()) {
            for(int i=0; i<s.length(); i++) {
                if(!t.contains(s.charAt(i)+"")) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
};

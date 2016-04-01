public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        int length = 0;
        String[] words = s.split(" ");
        if(words.length>0) {
            length = words[words.length-1].length();
        } else {
            length = 0;
        }
        return length;
    }
}

public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        for (int i = 0; i < length; i++) {
            char c = string[i];
            if(c == ' ') {
                for (int j = length-1; j > i; j--) {
                    string[j+2] = string[j];
                }
                string[i] = '%';
                string[i+1] = '2';
                string[i+2] = '0';
                length = length + 2;
            }
        }
        return length;
    }
}

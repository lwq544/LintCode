public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        String str = Integer.toBinaryString(num);
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1') {
                count ++;
            }
        }
        return count;
    }
};

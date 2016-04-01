public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        int i = 1;
        if (digits[digits.length - 1] == 9) {
            while (digits[digits.length - i] == 9) {
                if(i == digits.length) { // 特殊情况：所有数字都是9
                    int[] newDigits = new int[digits.length+1];
                    newDigits[0] = 1;
                    for(int j=1; j<newDigits.length;j++) {
                        newDigits[j] = 0;
                    }
                    return newDigits;
                } else {
                    digits[digits.length - i] = 0;
                    i++;
                }
            }
            digits[digits.length - i] += 1;
        } else {
            digits[digits.length - 1] += 1;
        }
        return digits;
    }
}

public class Solution {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
    public char[] rotateString(char[] A, int offset) {
        // wirte your code here
        if(A.length==0) {
            return A;
        } else  {
            offset = offset%A.length;
            String temp = new String(A).substring(A.length-offset);
            for(int i=A.length-offset-1; i>=0; i--) {
                A[i+offset] = A[i];
            }
            for(int i=0; i<temp.length();i++) {
                A[i] = temp.charAt(i);
            }
            return A;
        }
    }
};

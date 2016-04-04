public class Solution {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A.length == 0) return 0;
        for (int i=0; i < A.length; i++) {
            if(target == A[i]) {
                return i;
            }
            if(target < A[i]) {
                return i;
            }
        }
        return A.length;
    }
}

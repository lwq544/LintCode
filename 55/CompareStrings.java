public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0; i<A.length(); i++) {
            list.add(A.charAt(i));
        }
        boolean flag = true;
        for(int i=0;i <B.length(); i++) {
            if(!list.contains(B.charAt(i))) {
                flag = false;
            } else {
                list.remove(list.indexOf(B.charAt(i)));
           }
        }
        return flag;
    }
}

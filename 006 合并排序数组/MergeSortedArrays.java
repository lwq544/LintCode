class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) <= B.get(j)) {
                list.add(A.get(i));
                i++;
            } else {
                list.add(B.get(j));
                j++;
            }
        }
        while (i < A.size()) {
            list.add(A.get(i));
            i++;
        }
        while (j < B.size()) {
            list.add(B.get(j));
            j++;
        }
        return list;
    }
}

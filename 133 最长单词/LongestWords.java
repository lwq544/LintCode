class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> list = new ArrayList<String>();
        int max = 0;
        for (int i=0; i<dictionary.length; i++) {
            String word = dictionary[i];
            if(word.length() > max) {
                max = word.length();
                list.removeAll(list);
                list.add(word);
            } else if(word.length() == max) {
                list.add(word);
            }
        }
        return list;
    }
};

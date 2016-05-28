package Trie;

/**
 * Created by Silocean on 2016-05-28.
 */
public class Trie {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("lintcode");
        System.out.println(trie.search("code"));
        System.out.println(trie.startsWith("lint"));
        System.out.println(trie.startsWith("linterror"));
        trie.insert("linterror");
        System.out.println(trie.search("lintcode"));
        System.out.println(trie.startsWith("linterror"));
    }

    private static int R = 256;
    private TrieNode root;

    // Inserts a word into the trie.
    public void insert(String word) {
        root = insert(root, word, 0);
    }

    private TrieNode insert(TrieNode x, String key, int d) {
        if (x == null) x = new TrieNode();
        if (d == key.length()) {
            x.isEnd = true;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = insert(x.next[c], key, d + 1);
        return x;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode x = search(root, word, 0);
        if (x == null) return false;
        else if (x.isEnd == false) return false;
        else return true;
    }

    private TrieNode search(TrieNode x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) return x;
        char c = key.charAt(d);
        return search(x.next[c], key, d + 1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode x = search(root, prefix, 0);
        if (x == null) return false;
        return true;
    }

}

class TrieNode {
    public TrieNode[] next = new TrieNode[256];
    public boolean isEnd;

    public TrieNode() {
    }
}
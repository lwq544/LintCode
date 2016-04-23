package unionFind;

/**
 * Created by Tracy on 2016-04-23.
 */
public class ValidTree {
    private static int[] id;

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        System.out.println(validTree(5, edges));
    }

    public static boolean validTree(int n, int[][] edges) {
        if (n - edges.length >= 2 || n - edges.length < 0) return false;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int pID = find(edges[i][0]);
            int qID = find(edges[i][1]);
            if (pID == qID) {
                return false;
            } else {
                id[pID] = qID;
            }
        }
        return true;
    }

    private static int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

}

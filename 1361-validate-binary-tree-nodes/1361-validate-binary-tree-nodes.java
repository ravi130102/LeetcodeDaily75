class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] parent = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = parent[i] = -1;
        int countP = 0;
        for (int i = 0; i < n; i++)
            if (validateNode(i, leftChild, rightChild, parent, dp) == 0) return false;
        for (int i = 0; i < n && countP <= 1; i++) countP += parent[i] == -1 ? 1 : 0;
        return countP <= 1;
    }

    public int validateNode(int node, int[] lc, int[] rc, int[] parent, int[] dp) {
        if (node == -1) return 1;
        if (dp[node] != -1) return dp[node];
        if (lc[node] != -1 && parent[lc[node]] != -1) return dp[node] = 0;
        if (lc[node] != -1) parent[lc[node]] = node;
        if (rc[node] != -1 && parent[rc[node]] != -1) return dp[node] = 0;
        if (rc[node] != -1) parent[rc[node]] = node;
        return dp[node] = (validateNode(rc[node], lc, rc, parent, dp) == 1 &&
                validateNode(lc[node], lc, rc, parent, dp) == 1)
                ? 1 : 0;
    }
}
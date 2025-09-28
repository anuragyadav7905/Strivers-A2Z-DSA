class DisjointSet {
    int[] parent, size;

    DisjointSet(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int findParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]); // path compression
    }

    void unionBySize(int u, int v) {
        int pu = findParent(u);
        int pv = findParent(v);
        if (pu == pv) return;

        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;

        // Find max row and col index
        int maxRow = 0, maxCol = 0;
        for (int[] stone : stones) {
            maxRow = Math.max(maxRow, stone[0]);
            maxCol = Math.max(maxCol, stone[1]);
        }

        // Create DSU for (rows + cols)
        DisjointSet ds = new DisjointSet(maxRow + maxCol + 2);

        // To track unique nodes used
        HashSet<Integer> stoneNodes = new HashSet<>();

        // Connect row and column for each stone
        for (int[] stone : stones) {
            int row = stone[0];
            int col = stone[1] + maxRow + 1; // shift col index
            ds.unionBySize(row, col);
            stoneNodes.add(row);
            stoneNodes.add(col);
        }

        // Count number of connected components
        int components = 0;
        for (int node : stoneNodes) {
            if (ds.findParent(node) == node) {
                components++;
            }
        }

        // Max stones removed = total stones - components
        return n - components;
    }
}

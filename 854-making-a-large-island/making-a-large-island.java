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

    int findUPar(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findUPar(parent[node]);
    }

    void unionBySize(int u, int v) {
        int pu = findUPar(u);
        int pv = findUPar(v);
        if (pu == pv) return;
        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }
    }

    int getSize(int node) {
        return size[findUPar(node)];
    }
}

class Solution {
    private boolean isValid(int r, int c, int n) {
        return r >= 0 && r < n && c >= 0 && c < n;
    }

    public int largestIsland(int[][] grid) {
        int n = grid.length;
        DisjointSet ds = new DisjointSet(n * n);

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        // Step 1: Union all 1’s into components
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 0) continue;
                for (int ind = 0; ind < 4; ind++) {
                    int newr = row + dr[ind];
                    int newc = col + dc[ind];
                    if (isValid(newr, newc, n) && grid[newr][newc] == 1) {
                        int nodeNo = row * n + col;
                        int adjNodeNo = newr * n + newc;
                        ds.unionBySize(nodeNo, adjNodeNo);
                    }
                }
            }
        }

        int mx = 0;

        // Step 2: Try converting each 0 → 1 and calculate island size
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) continue;

                HashSet<Integer> components = new HashSet<>();
                for (int ind = 0; ind < 4; ind++) {
                    int newr = row + dr[ind];
                    int newc = col + dc[ind];
                    if (isValid(newr, newc, n) && grid[newr][newc] == 1) {
                        components.add(ds.findUPar(newr * n + newc));
                    }
                }

                int sizeTotal = 0;
                for (int parent : components) {
                    sizeTotal += ds.getSize(parent);
                }
                mx = Math.max(mx, sizeTotal + 1); // +1 for flipping this 0
            }
        }

        // Step 3: Handle case when grid has all 1’s
        for (int cellNo = 0; cellNo < n * n; cellNo++) {
            mx = Math.max(mx, ds.getSize(cellNo));
        }

        return mx;
    }
}

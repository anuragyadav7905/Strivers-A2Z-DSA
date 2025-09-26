// User function Template for Java
// class Solution {
//     static int kruskalsMST(int V, int[][] edges) {
//         // code here
        
//     }
// }


class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    // Sorting edges by weight
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class DisjointSet {
    int[] parent, size;

    DisjointSet(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;   // every node is its own parent initially
            size[i] = 1;     // size of each set = 1
        }
    }

    int findParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]); // path compression
    }

    void unionBySize(int u, int v) {
        int pu = findParent(u);
        int pv = findParent(v);
        if (pu == pv) return; // already in same set

        // attach smaller set under bigger set
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
    static int kruskalsMST(int V, int[][] edges) {
        // Step 1: Store edges in Edge list
        List<Edge> edgeList = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            edgeList.add(new Edge(u, v, wt));
        }

        // Step 2: Sort edges by weight
        Collections.sort(edgeList);

        // Step 3: Initialize Disjoint Set
        DisjointSet ds = new DisjointSet(V);
        int mstWeight = 0;

        // Step 4: Pick edges one by one
        for (Edge e : edgeList) {
            int u = e.src;
            int v = e.dest;
            int wt = e.weight;

            // If they belong to different sets -> take this edge
            if (ds.findParent(u) != ds.findParent(v)) {
                mstWeight += wt;
                ds.unionBySize(u, v);
            }
        }

        return mstWeight;
    }
}



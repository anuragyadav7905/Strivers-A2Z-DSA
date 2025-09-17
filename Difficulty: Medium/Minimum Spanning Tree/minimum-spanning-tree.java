import java.util.*;

class Solution {

    // Function to find sum of weights of edges of the Minimum Spanning Tree.
    public int spanningTree(int V, int[][] edges) {
        
        // Step 1: Build adjacency list from edges
        // Each list will store {neighbor, weight}
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt}); // since undirected
        }

        // Step 2: Use Priority Queue (min-heap) for Prim’s
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); 
        // each element: {weight, node}

        // Step 3: Keep track of visited nodes
        boolean[] vis = new boolean[V];

        // Step 4: Start from node 0
        pq.add(new int[]{0, 0}); 
        int sum = 0;

        while (!pq.isEmpty()) {
            int[] it = pq.poll(); 
            int wt = it[0];
            int node = it[1];

            // Skip if already visited
            if (vis[node]) continue;

            // Mark visited and add weight
            vis[node] = true;
            sum += wt;

            // Push all adjacent nodes into priority queue
            for (int[] nbr : adj.get(node)) {
                int adjNode = nbr[0];
                int adjWt = nbr[1];
                if (!vis[adjNode]) {
                    pq.add(new int[]{adjWt, adjNode});
                }
            }
        }

        return sum;
    }
}

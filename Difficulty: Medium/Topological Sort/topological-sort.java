import java.util.*;

class Solution {
    
    // DFS function
    private static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;

        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, st, adj);
            }
        }

        st.push(node); // push after visiting all neighbours
    }

    public ArrayList<Integer> topoSort(int V, int[][] edges) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        // Step 2: Visited array + stack
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();

        // Step 3: Call DFS for all nodes
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        // Step 4: Store result
        ArrayList<Integer> ans = new ArrayList<>();

        while (!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }
}
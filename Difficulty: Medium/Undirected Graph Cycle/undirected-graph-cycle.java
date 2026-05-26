class Solution {
    
    static class Node {
        int first, second;
        Node(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s,
            boolean vis[], int parent[]) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s, -1));
        vis[s] = true;

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            for (Integer it : adj.get(node)) {
                if (vis[it] == false) {
                    q.add(new Node(it, node));
                    vis[it] = true;
                } else if (par != it) return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Build adjacency list from edges
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        boolean vis[] = new boolean[V];
        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        for (int i = 0; i < V; i++) {
            if (vis[i] == false)
                if (checkForCycle(adj, i, vis, parent))
                    return true;
        }
        return false;
    }
}
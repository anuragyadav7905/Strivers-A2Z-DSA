class Solution {
    public void floydWarshall(int[][] dist) {
        int n = dist.length;
        int INF = (int)1e9;

        // Step 1: Replace 100000000 with INF, diagonal stays 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == 100000000) {
                    dist[i][j] = INF;
                }
                if (i == j) {
                    dist[i][j] = 0;
                }
            }
        }

        // Step 2: Run Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] < INF && dist[k][j] < INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        // Step 3: Convert INF back to 100000000
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF) {
                    dist[i][j] = 100000000;
                }
            }
        }
    }
}

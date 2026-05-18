class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // Step 1: Initialize the distance matrix
        int[][] dist = new int[n][n];
        
        // Set all distances to infinity (large value), except diagonal = 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0; // Distance to itself is 0
                } else {
                    dist[i][j] = (int)1e9; // Use large value to represent infinity
                }
            }
        }

        // Step 2: Fill given edges into the distance matrix
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            dist[u][v] = w;
            dist[v][u] = w; // Because graph is undirected
        }

        // Step 3: Floyd-Warshall Algorithm
        // Try every node as an intermediate point
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Update shortest distance
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Step 4: Find city with minimum reachable neighbors
        int city = -1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }

            // If smaller count OR same count but larger city index
            if (count <= minCount) {
                minCount = count;
                city = i;
            }
        }

        return city;
    }
}

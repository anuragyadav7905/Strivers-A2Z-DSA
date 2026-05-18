class DisjointSet{
    int[] parent,size;

    DisjointSet(int n){
        parent =new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    int findParent(int node){
        if(parent[node]==node) return node;
        return parent[node] = findParent(parent[node]);
    }

    void unionBySize(int u,int v){
        int pu=findParent(u);
        int pv=findParent(v);
        if(pu==pv) return;

        if(size[pu]<size[pv]){
            parent[pu]=pv;
            size[pv]+=size[pu];
        }
        else{
            parent[pv]=pu;
            size[pu]+=size[pv];

        }
        }



    }



class Solution {
    public int makeConnected(int n, int[][] connections) {
        // If less than n-1 edges, impossible to connect
        if (connections.length < n - 1) return -1;

        DisjointSet ds = new DisjointSet(n);
        int extraEdges = 0;

        // Step 1: Try to union nodes
        for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];

            if (ds.findParent(u) == ds.findParent(v)) {
                // Already connected -> this edge is extra
                extraEdges++;
            } else {
                ds.unionBySize(u, v);
            }
        }

        // Step 2: Count number of components
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (ds.findParent(i) == i) components++;
        }

        // Step 3: We need (components - 1) edges to connect all
        int needed = components - 1;

        if (extraEdges >= needed) return needed;
        return -1;
    }
}

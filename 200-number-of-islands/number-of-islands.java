class Solution {
    private void bfs(int ro,int co,int[][] vis,char[][] grid){
        vis[ro][co]=1;
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{ro,co});

        int[] drow = {-1, 1, 0, 0};
        int[] dcol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = 1;
                    q.add(new int[]{nrow, ncol});
                }
            }
        }
    }


    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 &&  grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
}
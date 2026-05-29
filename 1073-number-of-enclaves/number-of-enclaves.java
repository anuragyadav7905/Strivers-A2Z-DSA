class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis = new boolean[n][m];
        ArrayDeque<int[]> q=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0||i==n-1||j==0||j==m-1) && grid[i][j]==1 && !vis[i][j]){
                    vis[i][j]=true;
                    q.add(new int[]{i,j});
                }
            }
        }

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};

        while(!q.isEmpty()){
            int[] curr=q.poll();

            for(int k=0;k<4;k++){
                int nr=curr[0]+dr[k];
                int nc=curr[1]+dc[k];

                if(nr>=0 && nr<n && nc>=0 &&nc<m && !vis[nr][nc] && grid[nr][nc]==1){
                    vis[nr][nc]=true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]) cnt++;
            }
        }
            return cnt;
        }
    }

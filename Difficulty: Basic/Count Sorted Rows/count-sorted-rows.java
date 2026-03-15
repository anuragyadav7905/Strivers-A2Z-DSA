// User function Template for Java

class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int count =0;
        
        for(int i=0;i<N;i++){
            boolean Increasing=true;
            boolean Decreasing=true;
            for(int j=1;j<M;j++){
                if(Mat[i][j]<=Mat[i][j-1]){
                    Increasing=false;
                }
                if(Mat[i][j]>=Mat[i][j-1]){
                    Decreasing=false;
                }
            }
                if(Increasing||Decreasing){
                    count++;
                }
            }
        return count;
        
    }
};
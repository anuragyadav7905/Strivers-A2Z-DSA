// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        
        int prev=0;
        int prev2=0;
        
        for(int i=1;i<n;i++){
            int fs=prev+Math.abs(height[i]-height[i-1]);
            
            int ss=Integer.MAX_VALUE;
            if(i>1){
                ss=prev2+Math.abs(height[i]-height[i-2]);
            }
                
                int cur=Math.min(fs,ss);
                
                prev2=prev;
                prev=cur;
                
            }

            return prev;
        }
    }
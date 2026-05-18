class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int lp=0;
        int rp=n-1;
        int maxWater=0;

        while(lp<rp){
            int w=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int currWater=w*h;

            maxWater=Math.max(maxWater,currWater);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
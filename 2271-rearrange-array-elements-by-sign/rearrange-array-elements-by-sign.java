class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] positive=new int[n/2];
        int[] negative=new int[n/2];
        int p=0;
        int q=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                positive[p++]=nums[i];
            }else{
                negative[q++]=nums[i];
            }
        }
        int[] result = new int[n];
        p = 0;
        q = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = positive[p++];
            } else {
                result[i] = negative[q++];
            }
        }

        return result;

        
    }
}
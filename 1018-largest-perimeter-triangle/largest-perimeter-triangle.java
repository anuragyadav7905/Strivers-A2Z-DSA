class Solution {
    public int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length-1; i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                minIndex=j;
            }
        }
        int temp =nums[i];
        nums[i]=nums[minIndex];
        nums[minIndex]=temp;  
        }
        return nums;
    }

    public int largestPerimeter(int[] nums) {
        nums= selectionSort(nums);

        for(int i =nums.length-1;i>=2;i--){
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            if(a+b>c){
                return a+b+c;
            }
        }
        return 0;
    }
    
}
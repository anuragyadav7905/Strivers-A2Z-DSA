class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2) return -1;
        
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondLarge && arr[i] != large){
                secondLarge=arr[i];
            }
            
            
        }
        return secondLarge;
        
    }
}
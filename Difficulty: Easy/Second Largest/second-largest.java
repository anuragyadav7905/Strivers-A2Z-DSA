class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                if(arr[i]>a){
                    b=a;
                    a=arr[i];
                }
                else if(arr[i]>b && arr[i]!=a){
                    b=arr[i];
                }
            }
            
            if(b==Integer.MIN_VALUE) return -1;
            return b;
    }
}
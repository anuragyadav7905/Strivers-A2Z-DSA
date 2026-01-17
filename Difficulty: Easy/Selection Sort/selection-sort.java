class Solution {
    void selectionSort(int[] arr) {
        // code here
        
        
        // loop
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                // swap
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
            
            
        }

        
    }
}
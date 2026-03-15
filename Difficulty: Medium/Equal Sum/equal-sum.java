class Solution {
    String equilibrium(int arr[]) {
        
        int sum = 0;

        // total sum
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){

            int rightSum = sum - leftSum - arr[i];

            if(leftSum == rightSum){
                return "true";
            }

            leftSum += arr[i];
        }

        return "false";
    }
}
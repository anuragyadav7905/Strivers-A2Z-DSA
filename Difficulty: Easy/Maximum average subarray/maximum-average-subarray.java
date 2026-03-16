// User function Template for Java

class Solution {
    static int findMaxAverage(int arr[], int n, int k) {

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int maxSum = sum;
        int index = 0;

        // sliding window
        for(int i = k; i < n; i++){

            sum = sum + arr[i] - arr[i-k];

            if(sum > maxSum){
                maxSum = sum;
                index = i - k + 1;
            }
        }

        return index;
    }
}
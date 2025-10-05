// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int prev = arr[0];   // Max sum including first element
        int prev2 = 0;       // Max sum till element before previous one

        for (int i = 1; i < n; i++) {
            int take = arr[i];
            if (i > 1) take += prev2;

            int notTake = prev;

            int cur = Math.max(take, notTake);
            prev2 = prev;
            prev = cur;
        }

        return prev;
    }
}

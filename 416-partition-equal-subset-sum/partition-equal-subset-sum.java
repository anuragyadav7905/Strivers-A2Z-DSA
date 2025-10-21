class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // Calculate total sum
        for (int num : nums)
            totalSum += num;

        // If total sum is odd, cannot partition equally
        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;

        // DP array to track achievable subset sums
        boolean[] prev = new boolean[target + 1];
        prev[0] = true;  // sum 0 is always possible (empty subset)

        // Initialize with first element
        if (nums[0] <= target)
            prev[nums[0]] = true;

        // Build DP table iteratively
        for (int i = 1; i < n; i++) {
            boolean[] cur = new boolean[target + 1];
            cur[0] = true;
            for (int sum = 1; sum <= target; sum++) {
                boolean notTake = prev[sum];
                boolean take = false;
                if (nums[i] <= sum)
                    take = prev[sum - nums[i]];
                cur[sum] = take || notTake;
            }
            prev = cur;
        }

        // The answer lies in whether target sum can be formed
        return prev[target];
    }
}

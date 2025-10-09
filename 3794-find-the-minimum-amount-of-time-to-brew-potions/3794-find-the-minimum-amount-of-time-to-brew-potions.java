class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long[] dp = new long[n]; // dp[j] represents minimum finish time for wizard j
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Synchronize start times with previous wizard or previous potion
                if (j >= 1) {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                long timeConsume = (long) mana[i] * skill[j];
                if (j < n - 1) {
                    dp[j] = Math.max(dp[j], dp[j + 1] - timeConsume);
                }
                dp[j] += timeConsume;
            }
            // Backward pass to fix start times so that no wizard starts too early
            for (int j = n - 1; j > 0; j--) {
                dp[j - 1] = dp[j] - (long) mana[i] * skill[j];
            }
        }
        return dp[n - 1];
    }
}

public class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        
        // dp[i][j] = true if first i chars in s match first j chars in p
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        
        // Empty pattern matches empty string
        dp[0][0] = true;
        
        // Handle patterns like *, **, *** at the start that can match empty string
        for (int j = 1; j <= pLen; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                if (pc == '*') {
                    // '*' matches empty sequence or one more char in s
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (pc == '?' || pc == sc) {
                    // '?' matches any single char, or exact char match
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[sLen][pLen];
    }
}

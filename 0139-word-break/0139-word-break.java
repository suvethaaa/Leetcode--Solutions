class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()+1];
        return search(s,wordSet,0,dp);
    }

    static boolean search(String s , Set<String> wordSet , int index , Boolean[] dp){
        
        if(index == s.length()){
            return true;
        }

        if(dp[index] != null){
            return dp[index];
        }

        for(int i = index +1 ; i <= s.length() ; i++){
            String str = s.substring(index,i);

            if(wordSet.contains(str)){
                if(search(s,wordSet,i,dp)){
                    dp[i] = true;
                    return true;
                }
            }

        }
        dp[index] = false;
        return false;
    }
}
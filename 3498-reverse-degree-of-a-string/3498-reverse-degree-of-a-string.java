class Solution {
    public int reverseDegree(String s) {
        int[] check = new int[26];

        int c = 26;

        for(int i = 0 ; i < check.length ; i++){
            check[i] = c;
            c--;
        }
        
        int ans = 0;
        int idx = 1;

        for(char ch : s.toCharArray()){
            ans+=idx*(check[ch - 97]);
            idx++;
        }
        return ans;
    }
}
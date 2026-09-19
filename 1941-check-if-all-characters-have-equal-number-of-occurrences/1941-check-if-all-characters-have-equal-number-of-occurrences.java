class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        int f = 0;


        for(char ch : s.toCharArray()){
            freq[ch - 97]++;
            f = freq[ch - 97];
        }
        
        for(int fre : freq){
            if(fre != 0 && fre != f){
                return false;
            }
        }
        return true;
    }
}
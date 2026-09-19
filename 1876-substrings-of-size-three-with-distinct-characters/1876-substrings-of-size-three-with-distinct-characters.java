class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        int i = 0;
        int j = 3;

        while(j <= s.length()){
            if(check(s.substring(i,j))){
                count++;
            }
            i++;
            j++;
        }
        return count;
    }

    static boolean check(String str){

        if(str.charAt(0) == str.charAt(1) ||str.charAt(0) == str.charAt(2) || str.charAt(1) == str.charAt(2)){
            return false;
        }
        return true;
    }
}
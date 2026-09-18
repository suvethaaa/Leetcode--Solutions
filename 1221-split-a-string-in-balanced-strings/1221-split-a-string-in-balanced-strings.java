class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int lc = 0;
        int rc = 0;
        int i = 0;
        
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j);

            if(ch == 'R'){
                rc++;
            }else{
                lc++;
            }

            if(rc == lc){
                count++;
                rc = 0;
                lc = 0;
            }
        }
        return count;
    }
}
class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s.toCharArray()){
            freq1[ch - 'a']++;
        }


        for(char ch : target.toCharArray()){
            freq2[ch - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < freq2.length ; i++){
            int t = freq2[i];
            int u = freq1[i];
            if(t != 0){//this char is present in the target
                if(u != 0){// this char is present in the s
                    if(u >= t){
                        int che = u/t;
                        if(che < min){
                            min = che;
                        }
                    }else{
                        return 0;
                    }
                }else{
                    return 0;
                }
            }
        }
        return min;
    }
}
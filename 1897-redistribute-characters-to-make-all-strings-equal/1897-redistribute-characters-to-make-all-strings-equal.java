class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(words.length == 1) return true;
        
        for(String word : words){
            for(char ch : word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }

        
        for(int val : map.values()){
            if(val % words.length != 0){
                return false;
            }
        }
      
        return true;
    }
}
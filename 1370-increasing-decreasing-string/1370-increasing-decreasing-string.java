class Solution {
    public String sortString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();

        while(n > 0){

            for(char ch = 'a' ; ch <= 'z' ; ch++){
                if(map.containsKey(ch)){
                    if(map.get(ch) > 0){
                        map.put(ch,map.get(ch)-1);
                        sb.append(ch);
                        n--;
                    }
                }
            }
            for(char ch = 'z' ; ch >= 'a' ; ch--){
                if(map.containsKey(ch)){
                    if(map.get(ch) > 0){
                        map.put(ch,map.get(ch)-1);
                        sb.append(ch);
                        n--;
                    }
                }
            }
        }

        return sb.toString();
    }
}
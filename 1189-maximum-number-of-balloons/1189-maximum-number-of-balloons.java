class Solution {
    public int maxNumberOfBalloons(String text) {
        text = text.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        int low = Integer.MAX_VALUE;

        for(int i = 0; i < text.length() ; i++){
            char ch = text.charAt(i);
            

            if(ch == 'b'|| ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);
        if(map.size() < 5){
            return 0;
        }
        
        for(int val : map.values()){
            if(val < low){
                low = val;
            }
        }

        
        System.out.println(low);
        
        int l = map.get('l');
        int o = map.get('o');

        while(low > 0){
            if(l >= low*2 && o >= low*2){
                return low;
            }else{
                low--;
            }
        }

        return 0;
    }

    
}
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        int cnt = 0;
        for(int i = 0 ; i < suits.length-1 ; i++){
            if(suits[i] == suits[i+1]){
                cnt++;
            }
        }
        if(cnt == suits.length -1) return "Flush";

        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int rank : ranks){
            map.put(rank,map.getOrDefault(rank,0)+1);
            if(map.get(rank) > max){
                max = map.get(rank);
            }
        }

        if(max >= 3){
            return "Three of a Kind";
        }else if(max == 2){
            return "Pair";
        }
        return "High Card";
    }
}
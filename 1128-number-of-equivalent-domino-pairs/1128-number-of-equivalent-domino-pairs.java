class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int[] domino : dominoes){
            
            int a = Math.min(domino[0],domino[1]);
            int b = Math.max(domino[0],domino[1]);

            String key = a+","+b;

            map.put(key,map.getOrDefault(key,0)+1);
        }
        int pairs = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            int val = entry.getValue();

            pairs += (val*(val-1))/2;
        }

        return pairs;
    }
}
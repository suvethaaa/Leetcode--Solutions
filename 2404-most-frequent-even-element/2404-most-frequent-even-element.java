class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            if(n%2 == 0){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        System.out.println(map);
        int minKey = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            if(val >= max){
                if(max == val){
                    if(key < minKey){
                        minKey = key;
                    }
                }else{
                    minKey = key;
                }
                max = val;
            }
        }
        
        if(max < 0) return -1;

        return minKey;
    }
}
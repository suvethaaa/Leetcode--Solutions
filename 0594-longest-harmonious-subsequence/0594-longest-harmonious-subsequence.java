class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int harm = 0;

        for(int num : nums){
            if(map.containsKey(num+1)){
                if(map.get(num+1) + map.get(num) > harm){
                    harm = map.get(num+1) + map.get(num);
                }
            }
        }
        return harm;
    }
}
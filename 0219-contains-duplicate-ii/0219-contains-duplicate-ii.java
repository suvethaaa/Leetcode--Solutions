class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 0;
        for(int i = 0 ; i < nums.length ; i++){
            
            if(map.containsKey(nums[i])){
                idx = map.get(nums[i]);

                if(Math.abs(idx - i) <= k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
class Solution {
    public int mostFrequent(int[] nums, int key) {
        int max = Integer.MIN_VALUE;
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length -1 ; i++){
            if(nums[i] == key){
                Integer target = nums[i+1];
                map.put(target,map.getOrDefault(target,0)+1);
                if(map.get(target) > max){
                    System.out.println(map.get(target));
                    max = map.get(target);
                    ans = target;
                }
            }
        }
        System.out.println(map);
        return ans;
    }
}
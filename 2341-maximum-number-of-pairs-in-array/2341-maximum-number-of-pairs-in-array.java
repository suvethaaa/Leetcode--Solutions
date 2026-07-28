class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int first = 0;
        int second = 0;
        for(int num : map.keySet()){
            int dem = map.get(num) / 2;
            first+=dem;

            if(map.get(num)%2 != 0){
                second++;
            }

        }

        return new int[]{first , second};
    }
}
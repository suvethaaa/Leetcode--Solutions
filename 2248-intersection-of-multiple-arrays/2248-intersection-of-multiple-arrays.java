class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int[] num : nums){
            for(int n : num){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            if(val == n){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}
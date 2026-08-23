class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getValue(),entry.getKey()});
        }

        list.sort(Comparator.comparingInt((int[] arr) -> arr[0]).reversed());
        int[] ans = new int[k];

        for(int i = 0 ; i < k ; i++){
            ans[i] = list.get(i)[1];
        }
        return ans;
    }
}
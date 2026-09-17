class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ar : arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            if(entry.getValue() == key){
                if(key > max){
                    max = key;
                }
            }
        }
        if(max < 0){
            return -1;
        }
        return max;
    }
}
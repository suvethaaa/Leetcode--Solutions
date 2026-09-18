class Solution {
    public int[] sortByBits(int[] arr) {
        
        Map<Integer, List<Integer>> map = new TreeMap<>();

        for(int ar : arr){
            int bits = Integer.bitCount(ar);
            map.computeIfAbsent(bits, k -> new ArrayList<>()).add(ar);
        }

        map.forEach((key, list) -> Collections.sort(list));
        int res = 0;
        for(List<Integer> list : map.values()){
            for(int n : list){
                arr[res] = n;
                res++;
            }
        }

        return arr;
    }
}
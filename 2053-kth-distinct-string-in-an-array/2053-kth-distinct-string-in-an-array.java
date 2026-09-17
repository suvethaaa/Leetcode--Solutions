class Solution {
    public String kthDistinct(String[] arr, int k) {
        if(k > arr.length){
            return "";
        }

        HashMap<String,Integer> map = new HashMap<>();

        for(String ar : arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        System.out.println(map);

        String ans = "";

        int track = 0;

        for(String ar : arr){
            if(map.get(ar) == 1){
                track++;
            }
            if(track == k){
                return ar;
            }
        }
        return "";
    }
}
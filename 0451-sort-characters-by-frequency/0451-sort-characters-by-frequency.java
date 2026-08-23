class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        List<int[]> list = new ArrayList<>();

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            list.add(new int[]{entry.getValue(),entry.getKey()});
        }
        list.sort(Comparator.comparingInt((int[] arr) -> arr[0]).reversed());
        

        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i < list.size() ; i++){
            for(int j = 0 ; j < list.get(i)[0] ; j++){
                str.append((char) list.get(i)[1]);
            }
        }

        return str.toString();
    }
}
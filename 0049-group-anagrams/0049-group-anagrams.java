class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            String con = convert(str);

            
            map.computeIfAbsent(con,k -> new ArrayList<>()).add(str);
            
        }

        for(List<String> list : map.values()){
            ans.add(list);
        }

        return ans;
    }

    static String convert(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String res = new String(ch);
        return res;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i++){
            ans.add(new ArrayList<>());
            int x = 1;

            for(int j = 1 ; j <= i ; j++){
                ans.get(i-1).add(x);
                x = x * (i - j) / j;
            }
        }
        return ans;
    }
}
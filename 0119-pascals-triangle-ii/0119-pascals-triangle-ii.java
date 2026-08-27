class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        long x = 1;

        for(int j = 0 ; j <= rowIndex ; j++){
            ans.add((int) x);
            x = x * (rowIndex - j) / (j + 1);
        }
        return ans;
    }
}
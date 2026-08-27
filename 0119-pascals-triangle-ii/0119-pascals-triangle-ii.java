class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> row = new ArrayList<>();
        long x = 1; 
        
        for (int j = 0; j <= rowIndex; j++) {
            row.add((int) x);
            x = x * (rowIndex - j) / (j + 1);
        }
        
        return row;
       
    }
}
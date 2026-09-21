class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] temp = new int[rows*cols][3];
        
        int k = 0;
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                int distance = Math.abs(rCenter - i) + Math.abs(cCenter - j);
                temp[k][0] = distance;
                temp[k][1] = i;
                temp[k][2] = j;
                k++;
            }
        }

        Arrays.sort(temp, Comparator.comparingInt(row -> row[0]));
        int[][] ans = new int[rows*cols][2];

        for(int i = 0 ; i < ans.length ; i++){
            ans[i][0] = temp[i][1];
            ans[i][1] = temp[i][2];
        }
        return ans;
    }
}
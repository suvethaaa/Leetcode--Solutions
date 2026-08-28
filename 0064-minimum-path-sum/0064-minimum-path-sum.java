class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int prev = 0;
        for(int i = 0 ; i < m ; i++){
            grid[i][0]+=prev;
            prev = grid[i][0];
        }

        prev = 0;
        for(int i = 0 ; i < n ; i++){
            grid[0][i]+=prev;
            prev = grid[0][i];
        }

        for(int i = 1 ; i < m ; i ++){
            for(int j = 1 ; j < n ; j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
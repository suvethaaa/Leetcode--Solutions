class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(m == 1 && n == 1){
            if(obstacleGrid[m-1][n-1] == 1) return 0;
            else return 1;
        }

        int[][] dp = new int[m][n];


        for(int i = 0 ; i < m ; i++){
            if(obstacleGrid[i][0] == 1){
                
                break;
            }else{
                dp[i][0] = 1;
            }
        } 

        for(int j = 0 ; j < n ; j++){
            if(obstacleGrid[0][j] == 1){
                
                break;
            }else{
                dp[0][j] = 1;
            }
        }

        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        for(int[] arr : dp){
            System.out.println(Arrays.toString(arr));
        }
        return dp[m-1][n-1];
    }
}
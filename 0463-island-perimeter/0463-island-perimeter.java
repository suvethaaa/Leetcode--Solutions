class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int pm = 0;

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){

                if(grid[i][j] == 1){
                    //check up
                    if(i == 0 || grid[i-1][j] == 0){
                        pm++;
                    }
                    
                    //check down 
                    if(i == grid.length-1 || grid[i+1][j] == 0){
                        pm++;
                    }
                    
                    //check left 
                    if(j == 0 || grid[i][j-1] == 0){
                        pm++;
                    }
                    
                    //check right
                    if(j == grid[0].length -1 || grid[i][j+1] == 0){
                        pm++;
                    }
                    
                }
            }
        }

        return pm;
    }
}
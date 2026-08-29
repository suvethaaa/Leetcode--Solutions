class Solution {
    private static List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {

        boolean[][] board = new boolean[n][n];
        res = new ArrayList<>();
        queens(board,0);
        return res;

    }

    static void queens(boolean[][] board , int row){

        if(row == board.length){
            addBoard(board);
            return;
        }

        for(int col = 0 ; col < board[0].length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,row+1);
                board[row][col] = false;
            }
        }
    }

    static void addBoard(boolean[][] board){
        List<String> list = new ArrayList<>();
        

        for(int i = 0 ; i < board.length ; i++){
            StringBuilder str = new StringBuilder();
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j]){
                    str.append('Q');
                }else{
                    str.append('.');
                }
            }
            list.add(str.toString());
        }
        res.add(list);
        return;
    }

    static boolean isSafe(boolean[][] board , int row , int col){
        
        for(int i = 0 ; i < row ; i++){
            if(board[i][col]){
                return false;
            }
        }
        //used to calculate the steps
        int maxLeft = Math.min(row,col);

        for(int i = 1 ; i <= maxLeft ; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,board.length - col - 1);

        for(int i = 1 ; i <= maxRight ; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
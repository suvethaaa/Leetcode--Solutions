class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0)) {
                    if (search(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static boolean search(char[][] board, int row, int col,
                          int index, String word) {

        
        if (index == word.length()) {
            return true;
        }

        
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length) {
            return false;
        }

       
        if (word.charAt(index) != board[row][col]) {
            return false;
        }

       
        char original = board[row][col];

       
        board[row][col] = '#';

        
        boolean found =
                search(board, row, col + 1, index + 1, word) ||
                search(board, row, col - 1, index + 1, word) ||
                search(board, row + 1, col, index + 1, word) ||
                search(board, row - 1, col, index + 1, word);

        
        board[row][col] = original;

        return found;
    }
}
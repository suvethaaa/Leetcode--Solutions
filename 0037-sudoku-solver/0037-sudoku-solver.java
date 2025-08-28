class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length; // Should be 9
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Find empty cell
                if (board[row][col] == '.') {
                    // Try digits 1-9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;

                            if (solve(board)) {
                                return true;
                            } else {
                                board[row][col] = '.'; // backtrack
                            }
                        }
                    }
                    return false; // no valid digit found, trigger backtrack
                }
            }
        }
        return true; // solved all cells
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
            if (board[i][col] == num) return false;
        }

        // Check 3x3 sub-box
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;

        for (int r = boxRowStart; r < boxRowStart + 3; r++) {
            for (int c = boxColStart; c < boxColStart + 3; c++) {
                if (board[r][c] == num) return false;
            }
        }
        return true;
    }
}

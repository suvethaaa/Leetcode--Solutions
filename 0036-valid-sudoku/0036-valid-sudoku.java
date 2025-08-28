public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use hash sets to track numbers in rows, columns and 3x3 sub-boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int num = board[r][c] - '1'; // convert char to index 0-8
                int boxIndex = (r / 3) * 3 + c / 3;

                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false; // Duplicate found
                }

                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        return true;
    }
}

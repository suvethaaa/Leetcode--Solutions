class Solution {
    public long coloredCells(int n) {
        // Use long to prevent integer overflow for very large n
        return 2L * n * (n - 1) + 1;
    }
}


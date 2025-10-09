class Solution {
    public int findClosest(int x, int y, int z) {
     int person1 = 0;
        int person2 = 0;
        if (x > z) {
            person1 = x - z;
        }
        if (y > z) {
            person2 = y - z;
        }
        if (x < z) {
            person1 = z - x;
        }
        if (y < z) {
            person2 = z - y;
        }

        if (person1 < person2) {
            return 1;
        } else if (person2 < person1) {
            return 2;
        }

        return 0;
    }
}
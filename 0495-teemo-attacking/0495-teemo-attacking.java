class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int seconds = 0 ;
        int interval = 0;
        int prev = -1;

        for(int t : timeSeries){
            interval = t + duration -1;

            if(prev > t || prev == t){
                //skip the prev and continue;
                seconds += interval - prev;
            }else{
                seconds += interval - t + 1;
            }
            prev = interval;
        }
        return seconds;
    }

}
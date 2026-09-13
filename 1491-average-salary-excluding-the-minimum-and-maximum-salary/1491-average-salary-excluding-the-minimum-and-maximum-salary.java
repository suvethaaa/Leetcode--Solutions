class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avg = 0;
    
        for(int s : salary){
            if(s < min){
                min = s;
            }
            if(s > max){
                max = s;
            }
            avg+=s;
        }

        return (avg - (max + min))/(salary.length-2);

    }
}
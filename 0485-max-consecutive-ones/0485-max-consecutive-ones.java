class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max  = Integer.MIN_VALUE;
        int count = 0;
        for(int n : nums){
            if(n == 1) count++;
            else{
                if(count > max){
                    max = count;
                }
                count = 0 ;
            }
        }
        if(count > max){
            max = count;
            count = 0;
        }
        return max;
    }
}
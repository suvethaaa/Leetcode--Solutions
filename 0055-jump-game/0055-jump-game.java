class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length ==  1){
            return true;
        }
        int farthest = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(farthest >= nums.length-1){
                return true;
            } 
            
            farthest = Math.max(i+nums[i],farthest);
            
            if(farthest == i && nums[i] == 0){
                return false;
            }
        }

        return false;
    }
}
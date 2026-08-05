class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];

        int ind = 0;

        for(int num : nums){
            if(num % 2 == 0){
                ans[ind] = num;
                ind++;
            }
        }
        for(int num : nums){
            if(num % 2 != 0){
                ans[ind] = num;
                ind++;
            }
        }
        return ans;
    }
}
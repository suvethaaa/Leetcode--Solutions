class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeat = new HashSet<>();

        for(int j = 0 ; j < nums.length ; j++){
            if(j == 0 || nums[j] != nums[j-1]){
                if(seen.contains(nums[j])){
                    repeat.add(nums[j]);
                }else{
                    seen.add(nums[j]);
                }
            }
        }

        return seen.size() - repeat.size();
    }
}
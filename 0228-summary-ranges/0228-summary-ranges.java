class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        if(nums.length == 1){
            ans.add(String.valueOf(nums[0]));
            return ans;
        }

        int s = nums[0];
        int e = nums[0];
        

        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i+1] == e+1){
                e = nums[i+1];
            }else{
                if(s != e){
                    ans.add(s + "->" + e);
                }else{
                    ans.add(String.valueOf(s));
                }
                s = nums[i+1];
                e = nums[i+1];
            }
        }
        if(s != e){
            ans.add(s + "->" + e);
        }else{
            ans.add(String.valueOf(s));
        }
        return ans;
    }
}
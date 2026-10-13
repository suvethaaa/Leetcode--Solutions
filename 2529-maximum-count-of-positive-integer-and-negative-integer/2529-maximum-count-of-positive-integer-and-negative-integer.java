class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0 ;
        int neg = 0 ;
        int max = Integer.MIN_VALUE ; 
        for(int num : nums){
            if(num != 0){
                if(num > 0){
                    pos++;
                    System.out.println(pos);
                }else{
                    neg++;
                    System.out.println(neg);
                }
            }
            
        }
        return Math.max(pos,neg);
    }
}
class Solution {
    public int maxProduct(int[] nums) {
    
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : nums){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;   
            }
            else if(num > secondMax && num <= firstMax){
                secondMax = num;
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        return (firstMax-1) *  (secondMax-1);
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] answers = new int[n];

        //after creating the array nums storing the values first by calculating the left side products of the current number excluding it

        int left_product = 1;

        for(int i = 0 ; i < n ; i++){
            //we have a left product value calculated till now
            answers[i] = left_product;

            //updating the left product value by multiplying the current value so that it can be passed for the next element

            left_product *= nums[i];
        }

        //following same for the right side elements

        int right_product = 1;

        for(int i = n-1 ; i >= 0 ; i--){

            //first we already had the 0 values in the array so we simply find the product and stored it in the array 
            //now we should multiply the vlaues with the right product

            answers[i] *= right_product;

            //updating the right product the same way we did for left product

            right_product *= nums[i];

        }

        return answers;
    }
}
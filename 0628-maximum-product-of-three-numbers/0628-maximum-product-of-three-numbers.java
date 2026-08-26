class Solution {
    public int maximumProduct(int[] nums) {
        insertionSort(nums);
        int n = nums.length;

        if(nums[0]*nums[1]*nums[n-1] > nums[n-1]*nums[n-2]*nums[n-3]){
            return nums[0]*nums[1]*nums[n-1];
        }
        return nums[n-1]*nums[n-2]*nums[n-3];
    }

    static void insertionSort(int[] nums){

        for(int i = 0 ; i  < nums.length-1 ; i++){
            for(int j = i+1 ; j > 0 ; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
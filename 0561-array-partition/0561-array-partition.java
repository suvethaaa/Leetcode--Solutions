class Solution {
    public int arrayPairSum(int[] nums) {
        quickSort(nums,0,nums.length-1);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i+=2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }

    static void quickSort(int[] nums , int low , int high){

        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = nums[m];

        while(s <= e){
            while(nums[s] < pivot){
                s++;
            }

            while(nums[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            
        }

        quickSort(nums,low,e);
        quickSort(nums,s,high);
    }
}
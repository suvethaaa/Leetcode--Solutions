class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(int num : nums){
            map.put(num,i);
            i++;
        }
        System.out.println(map);
        
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums[n-1] >= nums[n-2]*2){
            return map.get(nums[n-1]);
        }
        return -1;
    }

    static void insertionSort(int[] arr){

        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i +1 ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
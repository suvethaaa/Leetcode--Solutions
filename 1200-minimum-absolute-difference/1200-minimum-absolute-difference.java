class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] < diff){
                diff = arr[i+1] - arr[i];
            }
        }

        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] == diff){
                List<Integer> ele = new ArrayList<>();
                ele.add(arr[i]);
                ele.add(arr[i+1]);
                ans.add(ele);
            }
        }

        return ans;
    }
}
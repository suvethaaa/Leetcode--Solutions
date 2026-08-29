class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return arr;
        int[] ans = arr.clone();
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        map.put(arr[0],rank);
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] != arr[i-1]){
                rank++;
                map.put(arr[i] ,rank);
            } 
        }
        System.out.println(map);
        System.out.println(Arrays.toString(ans));
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = map.get(ans[i]);
        }
        return ans;
    }

    static void quickSort(int[] arr , int low, int high){

        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s +(e-s)/2;
        int pivot = arr[m];

        while(s <= e){

            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            
        }
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
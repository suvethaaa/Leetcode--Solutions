class Solution {
    public String[] findRelativeRanks(int[] score) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ind = 0;
        for(int sc : score){
            map.put(sc,ind);
            ind++;
        }
        int[] arr = mergeSort(score);
        String[] ans = new String[arr.length];
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            idx = map.get(arr[i]);
            if(i == 0){
                ans[idx] = "Gold Medal";
            }else if(i == 1){
                ans[idx] = "Silver Medal";
            }else if(i == 2){
                ans[idx] = "Bronze Medal";
            }else{
                ans[idx] = String.valueOf(i+1);
            }
        }
        return ans;
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];

        int i = 0;  
        int j = 0;
        int k = 0;


        while(i < left.length && j < right.length){
            if(left[i] > right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
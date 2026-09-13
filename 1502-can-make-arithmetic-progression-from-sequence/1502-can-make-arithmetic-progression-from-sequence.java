class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        if(arr.length == 2){
            return true;
        }
        boolean ans = false;

        int[] check = mergeSort(arr);
        System.out.println(Arrays.toString(check));
        
        for(int i = 0 ; i < arr.length-2 ; i++){
            if(check[i+2] - check[i+1] == check[i+1] - check[i]){
                ans = true;
            }else{
                return false;
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

    static int[] merge(int[] left , int[] right){
        int m = left.length;
        int n = right.length;
        int[] mix = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < n){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
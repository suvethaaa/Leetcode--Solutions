class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n1 = g.length;
        int n2 = s.length;
        quickSort(g,0,n1-1);
        quickSort(s,0,n2-1);
        int count = 0;
        int j = 0;
        for(int i = 0 ; i < n2 && j < n1 ; i++){
            if(g[j] <= s[i]){
                count++;
                j++;
            }
        }
        return count;
    }

    static void quickSort(int[] arr , int low , int high){

        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
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
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] check = new int[1001];

        for(int n : target){
            check[n]+=1;
        }

        for(int n : arr){
            if(check[n] == 0){
                return false;
            }else{
                check[n]-=1;
            }
        }
        return true;
    }
}
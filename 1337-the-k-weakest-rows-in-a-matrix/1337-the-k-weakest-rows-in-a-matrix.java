class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int[] vul = new int[m];
        boolean[] check = new boolean[m];
        int idx = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(!check[j]){
                    if(mat[j][i] == 0){
                        vul[idx] = j;
                        check[j] = true;
                        idx++;
                    }
                }
            }
        }

        for(int i = 0 ; i < m ; i++){
            if(mat[i][n-1] == 1){
                vul[idx] = i;
                check[i] = true;
                idx++;
            }
        }
        System.out.println(Arrays.toString(vul));
        System.out.println(Arrays.toString(check));

        int[] ans = new int[k];

        for(int i = 0 ; i < k ; i++){
            ans[i] = vul[i];
        }
        return ans;
    }
}
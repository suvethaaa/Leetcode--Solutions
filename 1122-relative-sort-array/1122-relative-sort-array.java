class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr1){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int i = 0;
        for(int a : arr2){
            int times = map.get(a);
            while(times > 0){
                arr1[i] = a;
                i++;
                times--;
            }
            map.remove(a);
        }
        int s = i;
        System.out.println(map);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int times = entry.getValue();
            while(times>0){
                arr1[i] = entry.getKey();
                times--;
                i++;
            }
        }

        Arrays.sort(arr1,s,i);
        return arr1;
    }
}
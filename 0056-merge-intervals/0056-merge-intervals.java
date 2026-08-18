class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
		
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        for(int[] interval : intervals){
            if(interval[0] <= prevEnd){
                prevStart = Math.min(prevStart,interval[0]);
                prevEnd = Math.max(prevEnd,interval[1]);
            }else{
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(prevStart);
                temp.add(prevEnd);
                ans.add(temp);
                prevStart = interval[0];
                prevEnd = interval[1];
            }
        }

        List<Integer> temp = new ArrayList<Integer>();
                temp.add(prevStart);
                temp.add(prevEnd);
                ans.add(temp);
                
		return ans.stream()
           .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
           .toArray(int[][]::new);
    }
}
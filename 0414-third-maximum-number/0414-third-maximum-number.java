class Solution {
    public int thirdMax(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            list.add(num);
        }

        list = new ArrayList<>(new LinkedHashSet<>(list));

        Collections.sort(list,Collections.reverseOrder());

        if(list.size() >= 3){
            return list.get(2);
        }

        return list.get(0);
    }
}
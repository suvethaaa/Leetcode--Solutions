class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int box = 0;
        int max = Integer.MIN_VALUE;

        for(int i = lowLimit; i <= highLimit ; i++){
            box = findBox(i);
            map.put(box,map.getOrDefault(box,0)+1);
            if(map.get(box) > max){
                max = map.get(box);
            }
        }
        return max;
    }

    static int findBox(int n){
        int ans = 0;
        while(n > 0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
}
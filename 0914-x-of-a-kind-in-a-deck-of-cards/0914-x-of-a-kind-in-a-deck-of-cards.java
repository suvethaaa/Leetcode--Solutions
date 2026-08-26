class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        if(deck.length == 1){
            return false;
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < deck.length ; i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int gcd = map.get(deck[0]);
        for(Integer val : map.values()){
            gcd = gcd(gcd,val);
        }

        return gcd >= 2;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
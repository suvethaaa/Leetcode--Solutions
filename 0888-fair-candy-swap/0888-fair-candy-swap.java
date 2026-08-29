class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int aliceSum = 0;

        for(int a : aliceSizes){
            aliceSum+=a;
        }

        Set<Integer> bob = new HashSet<>();
        int bobSum = 0;

        for(int b : bobSizes){
            bobSum+=b;
            bob.add(b);
        }

        int diff = (aliceSum - bobSum)/2;
        

        for(int a : aliceSizes){
            int findB = a - diff;

            if(bob.contains(findB)){
                return new int[]{a,findB};
            }
        }
         
        return new int[]{};
    }
}
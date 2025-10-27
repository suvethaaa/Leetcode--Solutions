class Solution {
    public int maxProfit(int[] prices) {
        //tracking the min price so that the best time for buying stock can be found
        int minPrice = Integer.MAX_VALUE;
        //taking max profit as zero if no profit is found 0 will be returning else the new max profit is calculated and updated
        int maxProfit = 0;

        for(int price : prices){
            //if the current price is less than the min price it means that the stock can be bought on the current day rather than spending much on the previous day
            if(price < minPrice){
                minPrice = price;
            }
            //on the other scenario the price must be greater than the min price so that we  can calculate the profit of that particular day and our so far max profit and update the profit accordingly
            else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
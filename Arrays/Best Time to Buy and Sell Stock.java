// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int min_price=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-min_price;
            if(min_price>prices[i]){
                min_price=prices[i];
            }
            else{
                maxp=Math.max(maxp,profit);
            }
        }
        return maxp;
    }
}
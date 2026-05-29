class Solution {
    public int maxProfit(int[] prices) {

        int maxProf =0;

        int minBuy=prices[0];
        for(int i=0;i<prices.length; i++){

            if(prices[i]<minBuy){
                minBuy=prices[i];
            }

            int sellProfit = prices[i]-minBuy;
            if(sellProfit>maxProf){
                maxProf=sellProfit;

            }
        
        }
        return maxProf;
    }
}

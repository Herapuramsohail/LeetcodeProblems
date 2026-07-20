class Solution {
    public int maxProfit(int[] prices) {
        int lowestprice = prices[0];
        int maxprofit = 0;
        

        for(int i = 1; i < prices.length; i++){
            int currentprice = prices[i];
            
            if(currentprice < lowestprice){
                lowestprice =  currentprice;

            }else{
                int currentprofit = currentprice - lowestprice;
                maxprofit =Math.max(maxprofit,currentprofit);
               
            }
        }
        return maxprofit;
        
    }
}
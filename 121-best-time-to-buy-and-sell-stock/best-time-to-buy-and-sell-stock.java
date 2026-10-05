class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for (int x : prices){
            if(x < buy)
                buy = x;
            else
            {
                int temp = x-buy;
                if(temp > profit)
                    profit = temp;
            }
        }
        return profit;
    }
}
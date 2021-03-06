//O(N^2)
public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int total = 0;
        for(int i = 0; i < prices.length; ++i){
            int sum = singleTrade(prices, 0, i + 1)
		+ singleTrade(prices, i, prices.length);
            if(total < sum)
                total = sum;
        }
        return total;
    }
    public int singleTrade(int[] prices, int start, int end){
        int max = 0;
        int low = Integer.MAX_VALUE;
        for(int j = start; j < end; ++j){
            if(prices[j] < low)
                low = prices[j];
            int val = prices[j] - low;
            if(val > max)
                max = val;
        }
	return max;
    }
}
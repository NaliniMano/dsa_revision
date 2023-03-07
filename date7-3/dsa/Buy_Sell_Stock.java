package daily_dsa_prob;

import org.junit.Test;

public class Buy_Sell_Stock {

	@Test
	public void example1()
	{
		int[] prices= {1,2};
		//7,6,4,3,1
		
		   int buy=0,profit=0,max=Integer.MIN_VALUE;
	        for(int i=0;i<prices.length;i++)
	            {
	            for(int j=i+1;j<prices.length;j++)
	            {
	               profit=prices[j]-prices[i];
	                max=Math.max(profit ,max);
	            }
	        }
	        
	        if(max<1) max=0;
	      System.out.println(max);
	      //  return max;
	}
	
	@Test
	public void example2()
	{
		int[] prices= {2,3,4,5};
		maxProfit(prices);
	}
	
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            profit = Math.max(profit, price-minPrice);
        }
        return profit;
    }

}

/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

/**
 *
 * @author Portatil
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] prices = {7,1,5,3,6,4};
       
       System.out.print("The maximum profit for the prices ");
       
       printArray(prices);
       
       System.out.println("is: "+maxProfit(prices));
       
    }
    
     public static  int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        
        int maxProfit = 0;
        
        for(int i=0;i<prices.length;i++)
        {
            //If we found the lowest possible price
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > maxProfit) //If it generates a greater profit
                maxProfit = prices[i] - minPrice;
            
        }
        
        return maxProfit;
    }
     
     public static void printArray(int [] arr)
     {
         for(int item : arr)
         {
             System.out.print(item+" ");
         }
     }
    
}

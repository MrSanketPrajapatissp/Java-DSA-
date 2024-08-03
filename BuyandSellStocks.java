/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Sanket Prajapati
 */
public class BuyandSellStocks {
    
    public static int BuySellstocks(int prices[])
    {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int currProfit = prices[i] - buyPrice; // Sell Price - buy Price = Profit
                maxProfit = Math.max(maxProfit, currProfit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        
        return maxProfit;
        
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit: "+BuySellstocks(prices));
    }

  
}

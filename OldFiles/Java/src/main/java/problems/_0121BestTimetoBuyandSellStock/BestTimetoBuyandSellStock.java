package com.vishwaraj.OldFiles.Java.src.main.java.problems._0121BestTimetoBuyandSellStock;

/**
 * BestTimetoBuyandSellStock
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] prices = //{7,6,4,3,1};
        {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxprofit = 0;
        for(int price : prices){
            if(price < minPrice) minPrice = price;
            else maxprofit =  Math.max(price - minPrice, maxprofit);
        }

       return maxprofit;
       
   }


    //brute force
    public static int maxProfit1(int[] prices) {
        
        int maxPro = 0;

        for(int i = 0; i< prices.length-1; i++){

            int profit = 0, buy = prices[i], sell;
            for(int j = i+1; j< prices.length; j++){
                sell = prices[j];
                if(buy > sell) break;
                int diff = sell - buy;
                profit = Math.max(profit, diff);
            }
        
            maxPro = Math.max(maxPro, profit);
        }

        return maxPro;
    }
}
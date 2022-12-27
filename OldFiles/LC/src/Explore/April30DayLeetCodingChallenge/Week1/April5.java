package com.vishwaraj.OldFiles.LC.src.Explore.April30DayLeetCodingChallenge.Week1;

/**
 * April5
 */
public class April5 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}
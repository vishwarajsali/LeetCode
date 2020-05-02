package Explore.April30DayLeetCodingChallenge.Week1;

/**
 * April5
 */
public class April5 {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        int prev = prices[0];
        int buy = 0, sell = 0;
        for(int i : prices){
            if(prev > i){
                buy = i;
            }else {
                sell= i;
            }
            sum += Math.max(sum, (sell - buy));
        }

        return sum;
    }
}
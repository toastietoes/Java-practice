package com.leetcode.datastructure;

public class BestTimeToBuy {
    public static void main(String[] args){
        BestTimeToBuy test = new BestTimeToBuy();
        int[] inputArrays = new int[]{7,1,5,3,6,4};
        test.BestTimeToBuy(inputArrays);
    }
    public int BestTimeToBuy(int[] prices){
        int profit = 0;
        boolean holding = false;
        for (int i=0; i <= prices.length-1; i++){
            if (i != prices.length - 1 && prices[i+1] > prices[i]){
                if (holding == false){
                    profit = profit - prices[i];
                    holding = true;
                }
                else if (holding == true){
                    if (i == prices.length-1){
                        profit = profit + prices[i];
                    }
                }
            }
            else if (i == prices.length - 1 && holding == true){
                profit = profit + prices[i];
            }
            else if (i != prices.length - 1 && prices[i+1] < prices[i]) {
                if (holding == true) {
                    profit = profit + prices[i];
                    holding = false;
                }
            }

        }
        System.out.println(profit);
        return profit;
    }
}

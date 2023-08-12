package com.Codility;

public class MaxProfit {
	public static int findMaxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = new int[6];
		prices[0] = 23171;
		prices[1] = 21011;
		prices[2] = 21123;
		prices[3] = 21366;
		prices[4] = 21013;
		prices[5] = 21367;
		int maxProfit = findMaxProfit(prices);

		System.out.println("Maximum Profit: " + maxProfit);
		// Output: Maximum Profit: 5
	}

}

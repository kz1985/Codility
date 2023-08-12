package com.Codility;

public class MinAbsSum {
	 public static int findLowestAbsoluteSum(int[] arr) {
	        int maxElement = 0;
	        int sum = 0;
	        
	        for (int num : arr) {
	            num = Math.abs(num);
	            maxElement = Math.max(maxElement, num);
	            sum += num;
	        }
	        
	        int[] count = new int[maxElement + 1];
	        
	        for (int num : arr) {
	            count[Math.abs(num)]++;
	        }
	        
	        int[] dp = new int[sum / 2 + 1];
	        
	        for (int i = 1; i <= maxElement; i++) {
	            if (count[i] > 0) {
	                for (int j = 0; j <= sum / 2; j++) {
	                    if (dp[j] > 0) {
	                        dp[j] = count[i];
	                    } else if (j >= i && dp[j - i] > 0) {
	                        dp[j] = dp[j - i] - 1;
	                    }
	                }
	            }
	        }
	        
	        int lowestAbsoluteSum = sum;
	        
	        for (int i = sum / 2; i >= 0; i--) {
	            if (dp[i] > 0) {
	                lowestAbsoluteSum = sum - 2 * i;
	                break;
	            }
	        }
	        
	        return lowestAbsoluteSum;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 5, 2, -2};
	        int lowestAbsoluteSum = findLowestAbsoluteSum(arr);
	        
	        System.out.println("Lowest Absolute Sum: " + lowestAbsoluteSum);
	        // Output: Lowest Absolute Sum: 0
	    }

}

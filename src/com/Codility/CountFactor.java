package com.Codility;

public class CountFactor {

	public static int countFactors(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int number = 24; //12
		int factorCount = countFactors(number);

		System.out.println("Number of factors for " + number + ": " + factorCount);
		// Output: Number of factors for 12: 6/ 24:8
	}

}

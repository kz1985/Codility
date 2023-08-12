package com.Codility;

public class CountDiv {
	public static void main(String[] args) {
		int A = 6; //Starts of the range
		int B = 11; // Endo of the Range
		int K = 2; //Divisor
		
		int count = countDivisibleByK(A, B, K);
		System.out.println("Number of integers divisible by "+K+" in the rang ["+A+".."+B+"] : "+count);
		
		
	}
	
	
	
	
	
	
	public static int countDivisibleByK(int A, int B, int K) {
        int count = 0;


        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                count++;
            }
        }


        return count;
    }


}

package com.Codility;

public class LongestZeroSequence {
	 public static void main(String[] args) {
	        int num = 32; // The integer for which we want to find the longest zero sequence
	        int longestSequence = findLongestZeroSequence(num);
	        System.out.println("Longest zero sequence: " + longestSequence);
	    }


	    public static int findLongestZeroSequence(int num) {
	        String binary = Integer.toBinaryString(num); // Convert the integer to binary representation
	        int longestSequence = 0;
	        int currentSequence = 0;


	        for (int i = 0; i < binary.length(); i++) {
	            if (binary.charAt(i) == '0') {
	                currentSequence++;
	                longestSequence = Math.max(longestSequence, currentSequence);
	            } else {
	                currentSequence = 0;
	            }
	        }


	        return longestSequence;
	    }


}

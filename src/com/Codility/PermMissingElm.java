package com.Codility;

public class PermMissingElm {
	 public static void main(String[] args) {
	        int[] arr = {2, 3, 1, 5}; // Example permutation with a missing element


	        int missingElement = findMissingElement(arr);
	        System.out.println("The missing element is: " + missingElement);
	    }


	    public static int findMissingElement(int[] arr) {
	        int n = arr.length + 1; // Total number of elements in the permutation
	        int sum = (n * (n + 1)) / 2; // Sum of all elements in the complete permutation


	        for (int i = 0; i < arr.length; i++) {
	            sum -= arr[i]; // Subtract each element from the sum
	        }


	        return sum; // The remaining sum is the missing element
	    }

}

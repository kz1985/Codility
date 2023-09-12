package com.Codility;

import java.util.Arrays;

public class Int_Missing {
	  public static void main(String[] args) {
	        int[] arr = {1,2,3}; // Example array with a missing integer


	        int missingInteger = findMissingInteger(arr);
	        System.out.println("The missing integer is: " + missingInteger);
	    }


	    public static int findMissingInteger(int[] arr) {
	        Arrays.sort(arr); // Sort the array in ascending order


	        int missingInteger = 0;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i + 1] - arr[i] > 1) {
	                missingInteger = arr[i] + 1;
	                break;
	            }
	        }


	        return missingInteger;
	    }


}

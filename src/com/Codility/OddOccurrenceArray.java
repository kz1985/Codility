package com.Codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrenceArray {
	 public static int[] findOddOccurrenceArray(int[] arr) {
	        Map<Integer, Integer> countMap = new HashMap<>();
	        
	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }
	        
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() % 2 != 0) {
	                return new int[]{entry.getKey()};
	            }
	        }
	        
	        return new int[]{};
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 1, 3, 4, 4, 9};
	        int[] oddOccurrenceArray = findOddOccurrenceArray(arr);
	        
	        for (int num : oddOccurrenceArray) {
	            System.out.print(num + " ");
	        }
	        // Output: 4
	    }

}

package com.Codility;

import java.util.*;

public class DistinctElm {
	 public static int[] findDistinctElements(int[] arr) {
		 HashSet<Integer> distinctSet = new HashSet<>();
	        
	        for (int num : arr) {
	            distinctSet.add(num);
	        }
	        
	        int[] distinctArray = new int[distinctSet.size()];
	        int index = 0;
	        
	        for (int num : distinctSet) {
	            distinctArray[index++] = num;
	        }
	        
	        return distinctArray;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6};
	        int[] distinctElements = findDistinctElements(arr);
	        
	        for (int num : distinctElements) {
	            System.out.print(num + " ");
	        }
	        // Output: 1 2 3 4 5 6
	    }


}

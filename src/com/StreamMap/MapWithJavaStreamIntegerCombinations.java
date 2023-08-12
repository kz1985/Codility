package com.StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Map mainly utilizing for modification actual data
public class MapWithJavaStreamIntegerCombinations {

	public static void main(String[] args) {

		// Actual unsorted Data
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		

		// New storage
		List<Integer> modifiedList = new ArrayList<Integer>();

		// Method 1.
		System.out.println("Method 1. ");
		modifiedList = nums.stream().map(n->n*6).collect(Collectors.toList());
		System.out.println(modifiedList);

		// Method 2.
		System.out.println("Method 2. ");
		modifiedList = nums.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(modifiedList);
		
		// Method 3.
		System.out.println("Method 3. ");
		nums.stream().map(n->n+3).forEach(n->System.out.println(n));
		
		// Method 4.
		System.out.println("Method 4. ");
		nums.stream().map(n->n+10).forEach(System.out::println);
		
	}

}

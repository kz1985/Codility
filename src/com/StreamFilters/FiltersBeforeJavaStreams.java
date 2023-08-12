package com.StreamFilters;

import java.util.ArrayList;

public class FiltersBeforeJavaStreams {
	public static void main(String[] args) {

		// Treditional way
		
		//Actual Data List
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		//Add filtered Data into new list
		ArrayList<Integer> filteredNumbers = new ArrayList<Integer>();
		
		//Add data into the actual list
		numberList.add(20);
		numberList.add(30);
		numberList.add(21);
		numberList.add(65);
		numberList.add(99);
		numberList.add(22);
		for (int i : numberList) {
			if (i % 2 == 0)
				filteredNumbers.add(i);
		}
		System.out.println(filteredNumbers);

	}

}

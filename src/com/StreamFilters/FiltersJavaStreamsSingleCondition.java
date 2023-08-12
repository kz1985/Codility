
package com.StreamFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FiltersJavaStreamsSingleCondition {
	public static void main(String[] args) {

		// Filter method with java stream function
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,2,1,11,2,22,43,45,56,88,66,43,65,76,4);
		// System.out.print(i);

		// Add data into the list

		// Add filtered Data with even numbers into this list
		List<Integer> fileredEvenNumbers = new ArrayList<Integer>();

		System.out.println("Process 1.");
		fileredEvenNumbers = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("All the EVEN number from the list : " + fileredEvenNumbers);

		System.out.println("Process 2.");
		// Add filtered Data with Odd numbers into this list
		List<Integer> filteredOddNumbers = new ArrayList<Integer>();
		filteredOddNumbers = numberList.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		System.out.println("All the ODD number from the list : "+filteredOddNumbers);
		
		System.out.println("Process 3.");
		// Add filtered Data with greater then 30 numbers into this list
		List<Integer> filteredBigNumbers = new ArrayList<Integer>();
		filteredBigNumbers = numberList.stream().filter(n -> n>=30).collect(Collectors.toList());
		System.out.println("All the Big number from the list : "+filteredBigNumbers);
		
		System.out.println("Process 4.");
		// Add filtered Data with Less then 20 numbers into this list
		List<Integer> filteredSmallNumbers = new ArrayList<Integer>();
		filteredSmallNumbers = numberList.stream().filter(n->n<=10).collect(Collectors.toList());
		System.out.println("All the Small number from the list : "+filteredSmallNumbers);
		
		//Another way to enhanced printed data
		System.out.println("Process 5.");
		List<Integer> allData = new ArrayList<Integer>();
		numberList.stream().filter(n->n/2==1).forEach(n ->System.out.println(n));
		
		System.out.println("Process 6.");
		List<Integer> allData2 = new ArrayList<Integer>();
		numberList.stream().filter(n->n>20 && n<60).forEach(System.out::println);
		
		
		
		
		
		
		
	}

}

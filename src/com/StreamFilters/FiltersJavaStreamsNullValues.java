package com.StreamFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersJavaStreamsNullValues {
	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("OVEN", null, "FRIDGE", null, "WASHINGMACHIN", "FAN", null, "TABLE", null, "CHAIRE");
		
		List<String> filteredList = new ArrayList<String>();
		
		//Process 1
		System.out.println("Process 1.");
		filteredList = items.stream().filter(it->it!=null).collect(Collectors.toList());
		System.out.println(filteredList);
		
		//Process 2
		System.out.println("Process 2.");
		filteredList= items.stream().filter(a->a==null).collect(Collectors.toList());
		System.out.println(filteredList);
	
		//Process 3
		System.out.println("Process 3.");
	 
	
	}

}

package com.StreamFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltersJavaStreamsMultipleCondition {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Khosruz", "Zaman", "Miraz", "Zaman", "Liza", "Zaman");
		
		List<String> filteredList = new ArrayList<String>();
		
		//Process 1
		System.out.println("Process 1.");
		filteredList = names.stream().filter(str->str.length()>=5 && str.length()<9).collect(Collectors.toList());
		System.out.println(filteredList);
		
		//Process 2
		System.out.println("Process 2.");
		names.stream().filter(name->name.length()>1 && name.length()<6).forEach(str->System.out.println(str));
	
	
		//Process 3
		System.out.println("Process 3.");
		names.stream().filter(n->n.length()>=4 &&n.length()<5).forEach(System.out::println);
	
	}

}

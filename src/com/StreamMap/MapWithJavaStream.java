package com.StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Map mainly utilizing for modification actual data
public class MapWithJavaStream {

	public static void main(String[] args) {

		// Actual unsorted Data
		List<String> nameList = Arrays.asList("zaman", "Miraz", "JomjOm", "ponPon", "Lolita");

		// New storage
		List<String> modifiedList = new ArrayList<String>();

		// Method 1.
		System.out.println("Method 1. ");
		modifiedList = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(modifiedList);

		// Method 2.
		System.out.println("Method 2. ");
		modifiedList = nameList.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println(modifiedList);
		
		// Method 3.
		System.out.println("Method 3. ");
		nameList.stream().map(name->name.length()).forEach(n->System.out.println(n));
		
		// Method 4.
		System.out.println("Method 4. ");
		nameList.stream().map(name->name.length()).forEach(System.out::println);
		
	}

}

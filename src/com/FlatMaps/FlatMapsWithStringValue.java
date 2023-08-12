package com.FlatMaps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapsWithStringValue {
	public static void main(String[] args) {
		List<String> director = Arrays.asList("Angie", "Vince");
		List<String> managers= Arrays.asList("Sadia", "Sonia", "Juty", "Mahi", "Uma");
		List<String> crewMembers=Arrays.asList("Sendul", "Vafa", "Jhony", "Anis", "Joslin", "Angela", "Khosruz", "Farhana", "Adnan");
		
		//Actual list of employees
		List<List<String>> unSortedList = Arrays.asList(director, managers, crewMembers);
		System.out.println("Unsorted List of employees within saperate collections :"+unSortedList);
		
		
		for(List<String> fl:unSortedList) {
		 
			for(String dir:fl) {
				System.out.print(dir+", ");
			}
		}
		
		//Empty List for emolyee
		List<String> finalList = new ArrayList<String>();
		
		//Combine all employee with stream flatMap and store into the final List
		finalList = unSortedList.stream().flatMap(fm->fm.stream()).collect(Collectors.toList());
		System.out.println("\nCombined all employees in a single collection :"+finalList);
		
		/*
		 * //Find the Managers from the list and store another collection List<String>
		 * allManagers = new ArrayList<String>(); allManagers =
		 * finalList.stream().map(m->m.di (Collectors.toList());
		 * System.out.println(allManagers);
		 */
		
		
				
		
	}

}

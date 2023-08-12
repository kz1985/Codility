package com.FlatMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMaps {
	public static void main(String[] args) {
	
		//Map() 
		List<Integer> list1 = Arrays.asList(1,5,8,9,7,5);
		//System.out.println("Current Value: "+list1);
		List<Integer> list2 = list1.stream().map(m->m+5).collect(Collectors.toList());
		//System.out.println("New Value: "+list2);
		
		//FlatMap()
		
		//List of collection lst1, lst2, lst3
		List<Integer> lst1 = Arrays.asList(9,5,6);
		List<Integer> lst2 = Arrays.asList(9,5,6);
		List<Integer> lst3 = Arrays.asList(9,5,6);
		
		//Combine in a single list
		List<List<Integer>> totalList = Arrays.asList(lst1, lst2,lst3);
		System.out.println("Befor combine the original list of collections : "+totalList);
		
		//Implement FlatMap from Stream to combine all collections together
		
		List<Integer> combineList = totalList.stream().flatMap(fm->fm.stream()).collect(Collectors.toList());
		System.out.println("After combined, the new list is : "+combineList);
		
		//Added new 3 to the each collections value.
		List<Integer> combineList2 = totalList.stream().flatMap(fm->fm.stream().map(m->m+3)).collect(Collectors.toList());
		System.out.println("After adding new value (3), the new list is : "+combineList2);
		
		
		//Added new 3 separately to the each collections value.
		List<Integer> combineList3 = combineList.stream().map(t->t+4).collect(Collectors.toList());
		System.out.println("After adding separately new value (4), the new list is : "+combineList3);
		
		
		
	}
}

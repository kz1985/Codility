package com.FlatMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithIntValue {
	public static void main(String[] args) {
		
		//Map
		System.out.println("=========== Map Start ==========================");
		List<Integer> lst1 = Arrays.asList(1,3,4,5,6,7,89);
		List<Integer> lst2 = lst1.stream().map(n->n+5).collect(Collectors.toList());
		System.out.println("Actual List : "+lst1);
		System.out.println("After adding of 10 with each element : "+lst2);
		System.out.println("=========== Map End ==========================\n");
		
		//FlatMap
		System.out.println("\n=========== Flat Map ==========================");
		List<Integer> ListOne = Arrays.asList(2,3,6);
		List<Integer> ListTwo = Arrays.asList(9,8,4);
		List<Integer> ListThree = Arrays.asList(5,1,7);
		
		//Adding three list into the one list
		List<List<Integer>> mixList = Arrays.asList(ListOne, ListTwo, ListThree);
		System.out.println("Actual Value after Adding in al single list : "+mixList);
		List<Integer> finalList = mixList.stream().flatMap(f->f.stream().map(m->m+2)).collect(Collectors.toList());
		System.out.println("After Flat Map and adding 2 each of them : "+finalList);
		
		
		System.out.println("=========== Flat Map End ==========================");
		
		
	}

}

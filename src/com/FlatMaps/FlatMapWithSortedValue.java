package com.FlatMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students {

	String name;
	int role;
	char grade;

	Students(String name, int role, char grade) {
		this.name = name;
		this.role = role;
		this.grade = grade;
	}
}

public class FlatMapWithSortedValue {
	public static void main(String[] args) {

		List<Students> list1 = new ArrayList<Students>();
		list1.add(new Students("zaman", 12, 'A'));
		list1.add(new Students("Miraz", 103, 'A'));
		list1.add(new Students("Khosruz", 10, 'D'));
		list1.add(new Students("Liza", 149, 'B'));

		List<Students> list2 = new ArrayList<Students>();
		list2.add(new Students("Sandul", 201, 'D'));
		list2.add(new Students("Vafa", 200, 'E'));
		list2.add(new Students("Carlos", 190, 'B'));
		list2.add(new Students("Uma", 141, 'A'));

		// Add both collection in a single collection
		List<List<Students>> combinedList = Arrays.asList(list1, list2);

		// Empty List
		List<Students> finlaList = new ArrayList<Students>();

		// Add combination data into the empty list using FlatMap()
		finlaList = combinedList.stream().flatMap(st -> st.stream()).collect(Collectors.toList());

		List<String> allName = new ArrayList<String>();

		// To fatch All the name from entire collection and add into allName list

		allName = finlaList.stream().map(m -> m.name).collect(Collectors.toList());
		System.out.print("All the name of students : " + allName.toString() + ", ");
		List<String> ss = list1.stream().filter(f->f.role>99).map(m->m.name).collect(Collectors.toList());
		System.out.println("\nStu whos role is more then 99"+ss);
		

	}

}

//System.out.println("Combination of two Lists : "+combinedList);
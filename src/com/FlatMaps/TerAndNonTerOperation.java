package com.FlatMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Players {
	public String countryName;
	public String playerName;
	public int salary;
	public char group;

	Players(String countryName, String playerName, char group, int salary) {
		this.countryName = countryName;
		this.playerName = playerName;
		this.group = group;
		this.salary = salary;

	}

	void display() {
		System.out.println("Player Name: " + playerName + "\nCountry From :" + countryName + "\nGroup : " + group
				+ "\nSalary : " + salary);
	}

}

public class TerAndNonTerOperation {
	public static void main(String[] args) {
		// flatmap01();
		terminalsOpes();
		// nonTerminalOps();

	}

	public static void nonTerminalOps() {
		List<Integer> t1 = Arrays.asList(12, 12, 5, 2 - 1, -01, -23);

		// System.out.println("Total elements: "+t1.size());

		// Distinct
		System.out.println("------------------------------------ Distinct -----------------------------------------");
		List<Integer> dstnctObj = t1.stream().distinct().collect(Collectors.toList());
		System.out.println("Total Distinct found " + dstnctObj.size() + " From the total elemenets of " + t1.size());
		System.out.println(dstnctObj.toString());

		// Limit
		System.out.println("\n------------------------------------- Limit ----------------------------------------");
		List<Integer> lmtObj = t1.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limit of element is 5 : " + lmtObj);

	}

	public static void terminalsOpes() {

		// Distinct, max, min count, reduced

		List<String> r1 = Arrays.asList("M", "I", "R", "A", "Z", "2", "1");

		List<Integer> t1 = Arrays.asList(12, 12, 5, 2 - 1, -01, -23);

		// System.out.println("Total elements: "+t1.size());

		// Sorted with Asc and Desc
		System.out.println(
				"\n------------------------------------  Sorted with Comparator (Integer) Include Asc and Desc---------------");
		List<Integer> intSorts = t1.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Oredr : " + intSorts);
		List<Integer> intSortsRev = t1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending or Reverse Oredr : " + intSortsRev);

		// Sorted with Asc and Desc
		System.out.println(
				"\n------------------------------------ Sorted with Comparator (String)include Asc and Desc------------");
		List<String> strSorts = r1.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending order : " + strSorts);
		List<String> strSortRev = r1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descanding orders :" + strSortRev);

		// Sorted By Collection with Asc and Desc
		System.out.println("\n------------------------------------Sorted By Arrays Collection with Asc and Desc------------");
		Object ss[] = strSortRev.toArray();

		Arrays.sort(ss);
		System.out.println("Ascending orders : "+Arrays.toString(ss));

		Arrays.sort(ss, Collections.reverseOrder());
		System.out.println("Descending orders : "+Arrays.toString(ss));
			
		// Count
		System.out.println("\n------------------------------------ Count -----------------------------------------");
		long cntObj = t1.stream().count();
		System.out.println("Total number of elements : " + cntObj);
		long cntObj1 = t1.stream().distinct().count();
		System.out.println("Total distinct found from the list is : " + cntObj1);

		// Min
		System.out.println("\n------------------------------------ Min -----------------------------------------");
		Optional<Integer> minValue = t1.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println("Actual list of element is : " + t1 + "\nMinimum Value is : " + minValue);

		// Max
		System.out.println("\n------------------------------------ Max -----------------------------------------");
		Optional<Integer> maxValue = t1.stream().max((num1, num2) -> {
			return num1.compareTo(num2);
		});
		System.out.println("Actual list of element is : " + t1 + "\nMaximum Value is : " + maxValue);

		// Reduced
		System.out.println("\n------------------------------------ Reduced -----------------------------------------");
		Optional<String> red1 = r1.stream().reduce((value, combined) -> {
			return value + combined;
		});

		System.out.println("Before Values : " + r1);
		System.out.println("After Reducing :" + red1.get());

		// Reduced
		System.out.println("\n------------------------------------ ToArray -----------------------------------------");
		Object arr[] = r1.stream().toArray();
		for (Object n : arr) {
			System.out.println(n.toString());

		}

	}

	public static void flatmap01() {
		List<Players> team1 = new ArrayList<Players>();
		team1.add(new Players("USA", "Miraz", 'A', 12355));
		team1.add(new Players("CAN", "Arman", 'M', 12789));
		team1.add(new Players("UK", "Rihan", 'T', 12364));
		team1.add(new Players("MAX", "Carlos", 'Q', 14567));
		team1.add(new Players("NIG", "Tetul", 'D', 15479));
		team1.add(new Players("UG", "Boytol", 'B', 12369));
		team1.add(new Players("USA", "Miraz", 'A', 12355));
		team1.add(new Players("USA", "Miraz", 'A', 12355));

		List<Players> team2 = new ArrayList<Players>();
		team2.add(new Players("BD", "Abdul", 'C', 21456));
		team2.add(new Players("THI", "HuTu", 'A', 145218));
		team2.add(new Players("KSA", "Rahim", 'Q', 12458));
		team2.add(new Players("IND", "Dhiraz", 'M', 12489));
		team2.add(new Players("CH", "Chengish", 'L', 145214));
		team2.add(new Players("THI", "HuTu", 'A', 145218));
		team2.add(new Players("KSA", "Rahim", 'Q', 12458));
		team2.add(new Players("UAE", "Shah", 'E', 16201));

		List<List<Players>> allTeams = Arrays.asList(team1, team2);
//With Traditional way
		for (List<Players> lop : allTeams) {
			for (Players pp : lop) {
//				 
//				System.out.print(pp.countryName.toString()+", ");
//				System.out.println(pp.group+", ");
				// pp.display();

			}
		}
//With Java 8
		// List<Object> sortedValues = allTeams.stream().flatMap(f -> f.stream().map(m
		// -> m.salary>123000)).collect(Collectors.toList());
		// System.out.println("\n" + sortedValues);
		List<Object> sortedList2 = allTeams.stream().flatMap(f -> f.stream().map(m -> m.countryName))
				.collect(Collectors.toList());
		System.out.print(sortedList2 + "\n");

	}

}

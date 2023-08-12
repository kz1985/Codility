package com.Arrays_Collections;

import java.util.*;

public class ReversOrders {
	public static void main(String[] args) {
		// Distinct, max, min count, reduced

		List<String> r1 = Arrays.asList("M", "I", "R", "A", "Z", "2", "1");

		List<Integer> t1 = Arrays.asList(12, 12, 5, 2 - 1, -01, -23);

		System.out.println(
				"\n------------------------------------Sorted By Arrays Collection with Asc and Desc------------");
		Object ss[] = r1.toArray();

		Arrays.sort(ss);
		System.out.println("Ascending orders : " + Arrays.toString(ss));

		Arrays.sort(ss, Collections.reverseOrder());
		System.out.println("Descending orders : " + Arrays.toString(ss));
	}
}

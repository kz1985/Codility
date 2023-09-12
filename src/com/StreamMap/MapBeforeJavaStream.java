package com.StreamMap;

import java.util.*;

public class MapBeforeJavaStream {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("zaman", "Miraz", "JomjOm", "ponPon", "Lolita");
		List<String> modifiedValue = new ArrayList<String>();

		for (String newValue : nameList) {
			modifiedValue.add(newValue.toUpperCase());
		}
		System.out.println(modifiedValue);

	}
}

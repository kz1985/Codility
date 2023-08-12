package com.FlatMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Roughfss {
	public static void main(String[] args) {
		List<Integer> t1 = Arrays.asList(12, 12, 5, 2 - 1, -01, -23);
		
		Optional<Integer> maxValues = t1.stream().max((num1, num2)->{
			return num1.compareTo(num2);
		});
		Optional<Integer> minValue = t1.stream().min((val1, val2)->{
			return val1.compareTo(val2);
		});
		System.out.println("The Max Value is : "+maxValues.get()+"\nThe Min Value is : "+minValue.get());
		
		
		//Reduce
		System.out.println("\n------------------------------------ Reduced -----------------------------------------");
		List<String> redList = Arrays.asList("K", "H", "O", "S", "R", "U", "0", "0", "7" );
		Optional<String> redu = redList.stream().reduce((value, combineValue)->{
			return combineValue+value; //+combineValue;
		});
		System.out.println(redu);
		
		String name = "Khosruz_Z_a_m_a_n";
		String[] arr = name.split("_", 6);
		for (String tos : arr) {
			System.out.println(tos);
			
		}
		
	}
	
	
}

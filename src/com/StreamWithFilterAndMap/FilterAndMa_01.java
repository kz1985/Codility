package com.StreamWithFilterAndMap;

import java.util.*;
import java.util.stream.Collectors;

class Products {
	String name;
	int count;
	int price;

	Products(String name, int count, int price) {
		this.name = name;
		this.count = count;
		this.price = price;

	}

}

public class FilterAndMa_01 {
	public static void main(String[] args) {

		// Actual List
		List<Products> productList = Arrays.asList(new Products("oven", 1, 500), new Products("Fan", 2, 1000),
				new Products("KeyBoard", 9, 950), new Products("Iphone", 1, 590), new Products("Mouse", 11, 220),
				new Products("Fridge", 5, 2500), new Products("Stove", 3, 1892), new Products("Buttol", 11, 120),
				new Products("Monitor", 3, 750), new Products("SoundsBox", 2, 1200));

		// Method 1. New Container for price
		System.out.println("Method 1.");
		List<Integer> productPrice = new ArrayList<Integer>();

		productPrice = productList.stream().filter(p -> p.price > 590).map(p -> p.price).collect(Collectors.toList());
		System.out.println(productPrice);

		// Method 2. New Container for name
		System.out.println("Method 2.");
		List<String> productName = new ArrayList<String>();
		productName = productList.stream().filter(n -> n.name.startsWith("o")).map(n -> n.name)
				.collect(Collectors.toList());
		System.out.println(productName);

		// Method 3. New Container for quantity
		System.out.println("Method 3.");
		List<Integer> productQuantity = new ArrayList<Integer>();
		productQuantity = productList.stream().filter(q -> q.count > 2).map(q -> q.count).collect(Collectors.toList());
		System.out.println(productQuantity);

		// Method 4. New Container for quantity and price
		System.out.println("Method 4.");
		List<Object> quantityAndPrice = new ArrayList<Object>();

		productList.stream().filter(q -> q.count < 3).map(m -> m.count).forEach(m-> System.out.println(m));

	}
}

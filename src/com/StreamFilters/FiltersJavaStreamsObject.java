package com.StreamFilters;
import java.util.*;
import java.util.stream.Collectors;

class Products{
	int id;
	String name;
	double price;
	
	Products(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
}


public class FiltersJavaStreamsObject {
	public static void main(String[] args) {
		
		List <Products>productList = new ArrayList<Products>();
		
		productList.add(new Products(1, "MacBook", 2500));
		productList.add(new Products(2, "Accer", 500));
		productList.add(new Products(3, "Lanavo", 1200));
		productList.add(new Products(4, "Dell", 900));
		productList.add(new Products(5, "HP", 850));
		productList.add(new Products(6, "PHILIPS", 350));
		
		//Process 1
		System.out.println("Process 1. ");
		System.out.println("Filtered Price:  ");
		productList.stream().filter(pd->pd.price>500).forEach(pr->System.out.println(pr.price));
		
		//Process 2
		System.out.println("Process 2. ");
		System.out.println("Filtered Price:  ");
		 productList.stream().filter(p->p.price<1000).forEach(tt->System.out.println(tt.price));
		 
		
		
		
		
		
	}


}

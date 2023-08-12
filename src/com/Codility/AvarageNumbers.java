package com.Codility;

import java.util.Iterator;
import java.util.Scanner;

public class AvarageNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count of number: ");
		int count = sc.nextInt();
		double sum = 0;
		for(int k=0; k<count; k++) {
			System.out.println("Enter number: ");
			int x = sc.nextInt();
			sum = sum+x;
		}
		
		double avg  = sum/count;
		System.out.println("Total number: "+sum);
		System.out.println("avg: "+avg);
	}

}

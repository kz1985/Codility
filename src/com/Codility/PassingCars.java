package com.Codility;

public class PassingCars {

	public static void main(String[] args) {
		int[] cars = new int[5];// Example array of cars (0 represents eastbound, 1 represents westbound)
		cars[0] = 0;
		cars[1] = 1;
		cars[2] = 0;
		cars[3] = 1;
		cars[4] = 1;

		int passingCars = countPassingCars(cars);
		System.out.println("Number of passing cars: " + passingCars);
	}

	public static int countPassingCars(int[] cars) {
		int count = 0;
		int eastboundCars = 0;

		for (int car : cars) {
			if (car == 0) {
				eastboundCars++;
			} else {
				count += eastboundCars;
			}
		}

		return count;
	}

}

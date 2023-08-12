package com.Codility;

import java.util.Arrays;

public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 5;
		A[2] = 2;
		A[3] = 1;
		A[4] = 4;
		A[5] = 0;
		
		int intersections = countIntersections(A);
		System.out.println("Number of intersetions :"+intersections);
	}

	public static int countIntersections(int[] radii) {
		int n = radii.length;
		int[] leftEdges = new int[n];
		int[] rightEdges = new int[n];
		int intersections = 0;

		for (int i = 0; i < n; i++) {
			leftEdges[i] = i - radii[i];
			rightEdges[i] = i + radii[i];
		}

		Arrays.sort(leftEdges);
		Arrays.sort(rightEdges);

		int j = 0;
		for (int i = 0; i < n; i++) {
			while (j < n && rightEdges[i] >= leftEdges[j]) {
				intersections += j - i;
				j++;
			}
		}

		if (intersections > 10_000_000) {
			return -1; // Return -1 if the number of intersections exceeds 10,000,000
		}

		return intersections;
	}

}

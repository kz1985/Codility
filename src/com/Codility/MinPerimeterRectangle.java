package com.Codility;

public class MinPerimeterRectangle {
	  public static int findMinPerimeter(int area) {
	        int minPerimeter = Integer.MAX_VALUE;
	        
	        for (int i = 1; i <= Math.sqrt(area); i++) {
	            if (area % i == 0) {
	                int factor1 = i;
	                int factor2 = area / i;
	                
	                int perimeter = 2 * (factor1 + factor2);
	                
	                if (perimeter < minPerimeter) {
	                    minPerimeter = perimeter;
	                }
	            }
	        }
	        
	        return minPerimeter;
	    }
	    
	    public static void main(String[] args) {
	        int area = 30;
	        int minPerimeter = findMinPerimeter(area);
	        
	        System.out.println("Minimum Perimeter: " + minPerimeter);
	        // Output: Minimum Perimeter: 24
	    }


}

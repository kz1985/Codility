package com.Codility;

public class StrSymmetryPoint {
	public static int findSymmetryPoint(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return -1; // No symmetry point found
            }
            
            left++;
            right--;
        }
        
        return left; // Symmetry point found
    }
    
    public static void main(String[] args) {
        String str = "khosruz";
        int symmetryPoint = findSymmetryPoint(str);
        
        if (symmetryPoint == -1) {
            System.out.println("No symmetry point found");
        } else {
            System.out.println("Symmetry point: " + symmetryPoint);
        }
        // Output: Symmetry point: 2
    }

}

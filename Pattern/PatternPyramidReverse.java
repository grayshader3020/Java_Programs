class PatternPyramidReverse{
	public static void main(String[] args) {
		// for mix left=right triangle and right = left traingle
		// left triangle
		for (int i = 5; i >= 1; i--) {
            // Loop for spaces (left side)
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print("  ");
            }
            
            // Loop for left stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
        
        //right traingle
        // Loop for right stars (starting from the second star to avoid duplication in the middle)
            for (int k = 1; k < i; k++) {
                System.out.print(" *");
            }
            
            System.out.println();
        }
    }
}





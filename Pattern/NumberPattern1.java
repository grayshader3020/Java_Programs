/* 	1
	3   2
	6   5   4
	10  9   8  7  */
/*First, start is printed.
Then, start is decremented after printing.*/

class NumberPattern1{
	public static void main(String[] args) {
		int n= 4;
		int sum=1;

		for (int i=1;i<=n;i++ ) {
			int start = sum; //  First number in the row
			
			for (int j=0;j<i ;j++) {
				System.out.print((start--) + " "); // Print numbers in decreasing order
			}
	    //    1+1+1
		//    3+2+1
		sum = sum+i+1;
		System.out.println();

	}
	
   }
}
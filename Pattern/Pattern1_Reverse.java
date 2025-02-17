class Pattern1_Reverse{
	public static void main(String[] args) {
		int n=4;
		// iter1     0<=4
		for (int i=0;i<=n ;i++ ) {
			//
			for (int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
class PatternRightTraingleReverse{
	public static void main(String[] args) {
		for (int i=5;i>=1 ;i--) {
			//loop for spaces
			for (int j=1;j<=(5-i);j++) {
				System.out.print("  ");
			}
			//loop for stars
			for (int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
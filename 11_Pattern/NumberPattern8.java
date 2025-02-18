class NumberPattern8{
	public static void main(String[] args) {
		int a=1;
		char b='a';
		for (int i=1;i<=4 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				if ((j%2)!=0)
					System.out.print((a++)+" ");
				else
					System.out.print((b++)+" ");
			}	
			System.out.println();
		}
		
	}
}

/*
a
b c
d e f
g h i j
*/
class NumberPattern4{
	public static void main(String[] args) {
		char ch='a';
		for (int i=1;i<=4 ;i++ ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print((ch++)+" ");
			}
			System.out.println();
		}
	}
}
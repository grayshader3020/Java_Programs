import java.util.Scanner;
class LargestNumTernary4{
	public static void main(String[] args) {
		System.out.println("Enter a");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Enter b");
		int b = new Scanner(System.in).nextInt();
		System.out.println("Enter c");
		int c= new Scanner(System.in).nextInt();		
		System.out.println("Enter d");
		int d= new Scanner(System.in).nextInt();
		/*
		abcd

		a--|
		b--|a/b--|
		c--| c --| a/b/c---|
							largest number
		d--|---------------|

		*/
		int lar =(a>b)? ( (a>c && a>d)?(a) :((c>d)?(c):(d>c)?c:d)) :(  (b>c && b>d) ? (b):((c>d)?(c):(d>c)?d:c));
		int small =(a<b)? ( (a<c && a<d)?(a) :((c<d)?(c):(d<c)?c:d)) :(  (b<c && b<d) ? (b):((c<d)?(c):(d<c)?d:c));
		System.out.println("The Largest number is: " + lar);
		System.out.println("The Smallest number is: " + small);

	}
}
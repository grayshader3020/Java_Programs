import java.util.Scanner;

class NestedCond{
	public static void main(String[] args) {
		System.out.println("Enter a");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Enter b");
		int b = new Scanner(System.in).nextInt();
		System.out.println("Enter c");
		int c =new Scanner(System.in).nextInt();
		int lar =(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		int small =(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("The largest number is "+ lar);
		System.out.println("The smallest number is "+ small);
	}
}
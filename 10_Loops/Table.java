import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		System.out.print("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("Enter the Range: ");
		int r = new Scanner(System.in).nextInt();

		for (int i=1;i<=r;i++) {
			System.out.println(num +" X " + i + " = "+(num*i));
		}
	}
}
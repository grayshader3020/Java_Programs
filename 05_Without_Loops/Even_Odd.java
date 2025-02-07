import java.util.Scanner;

class  Even_Odd{
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num%2==0);
	}
}
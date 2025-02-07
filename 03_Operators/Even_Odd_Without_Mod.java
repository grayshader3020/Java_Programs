import java.util.Scanner;

class  Even_Odd_Without_Mod{
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		// LOGIC #1
		//System.out.println((num/2)==(num/2.0));
		// LOGIC #2
		System.out.println((num/2)*2==num);
	}
}
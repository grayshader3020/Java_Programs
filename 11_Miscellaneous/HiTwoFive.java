import java.util.Scanner;
class HiTwoFive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num = sc.nextInt();

		String op =((num%2==0)&&(num%5==0)?("Hi Two Five"):
					(num%2==0)?("Hi Two"):(num%5==0)?("Hi Five"):
					(" "));
		System.out.println(op);

	}
}
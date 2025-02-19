import java.util.Scanner;
class BuzzNo{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check : ");
		int num = new Scanner(System.in).nextInt();
		if ((num%7==0)||((num%10)==7)) {
			System.out.println(num+" is a Buzz Number");
		}
		else
		{
			System.out.println(num+" is not a Buzz Number");
		}
	}
}
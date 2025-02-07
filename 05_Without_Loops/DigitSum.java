import java.util.Scanner;

class DigitSum{
	public static void main(String[] args) {
		System.out.println("Enter any 3 digit number you want sum of");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;


		int rem = num%10; //123%10 =>3
		sum = sum + rem;
		num = num/10;

	    rem = num%10;
		sum = sum + rem;
		num = num/10;

		rem = num%10;
		sum = sum + rem;
		num = num/10;

		System.out.println("The sum of digits in number " + dup +" is " + sum);
	}
}
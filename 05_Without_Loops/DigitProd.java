import java.util.Scanner;

class DigitProd{
	public static void main(String[] args) {
		System.out.println("Enter any 3 digit number you want product of");
		int num = new Scanner(System.in).nextInt();
		int dup = num;


		int rem = num%10; //123%10 =>3
		int prod = rem; //3
		num = num/10;

	    rem = num%10; // 12%10 =2
		prod = prod * rem; //3*2 => 6
		num = num/10;

		rem = num%10; // 1%10 =>1
		prod = prod * rem; //6*1 => 6

		System.out.println("The product of digits in number " + dup +" is " + prod);
	}
}
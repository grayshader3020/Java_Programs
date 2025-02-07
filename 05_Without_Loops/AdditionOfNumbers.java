import java.util.Scanner;
class AdditionOfNumbers{
	public static void main(String[] args) {
		System.out.println("Enter the 4 digit number");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;

		int rem = num%10; //1234%10 => 4
		sum= sum + rem; // 0 + 4=> 4
		num = num/10;   // 1234/10 =>123

	    rem = num%10;  // 123%10 => 3
		sum= sum + rem;  // 4+3
		num = num/10;  // 123/10 => 12

	    rem = num%10;  // 12%10 => 2
		sum= sum + rem;
		num = num/10; 

		System.out.println(sum);


	}
}

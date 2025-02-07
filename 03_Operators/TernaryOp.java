//To check even or odd
import java.util.Scanner;
class TernaryOp{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		int num = new Scanner(System.in).nextInt();
		String ans = (num%2)==0?"Even":"Odd";
		System.out.println(ans);
	}
}
import java.util.Scanner;
class DuckNo{
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		String num = new Scanner(System.in).next();
		if ((num.charAt(0)=='0')) {
			System.out.println(num+" is not a duck number");
		}
		else if (num.contains("0")) {
			System.out.println(num+" is a duck number");
		}
		else{
			System.out.println(num+" is not a duck number");
		}
	}
}
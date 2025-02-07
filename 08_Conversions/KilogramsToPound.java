import java.util.Scanner;
class KilogramsToPound{
	public static void main(String[] args) {
		System.out.println("Enter the amount in Kilograms");
		float inKgs = new Scanner(System.in).nextFloat();

		double result = (inKgs/1)*(2.2046/1);
		System.out.println(inKgs + " Kilograms in Pounds is " + result + " Pounds");  
	}
}

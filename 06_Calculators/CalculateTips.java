import java.util.Scanner;

class CalculateTips{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount");
		float  subtotal = sc.nextFloat();
		System.out.println("Enter the gratuity % ");
		float tip = sc.nextFloat();
		float tipRate = (subtotal*tip)/100;
		float totalBill = subtotal + tipRate;
		System.out.println("Your total bill is: " + totalBill);
		System.out.println("Your tip rate is: " + tipRate);


	}
}
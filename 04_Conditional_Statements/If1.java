import java.util.Scanner;

class If1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bill amount");
		double billamt = sc.nextDouble();

		if(billamt > 2000){
			billamt = billamt - (billamt * 0.1);
		}
		System.out.println("Your bill amount is " +billamt);
	}
}
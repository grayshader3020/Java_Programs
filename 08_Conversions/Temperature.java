import java.util.Scanner;

class Temperature{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in degree celsius ");
		int celsius = sc.nextInt();

		double Farhenheit = (9.0/5)*celsius+32;

		System.out.println(celsius + " celsius  is " + Farhenheit +" Farhenheit");

	}
}

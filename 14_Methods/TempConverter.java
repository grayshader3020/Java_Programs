import java.util.Scanner;
class TempConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; ) {
		System.out.println();
		System.out.println(("*").repeat(47));
		System.out.println("       Temperature Converter      ");
		System.out.println(("*").repeat(47));
		System.out.println();
		System.out.println("1 .Convert Temperature from Celsius to Others");
		System.out.println("2 .Convert the Temperature from Farhenheit to Others");
		System.out.println("3 .Convert the Temperature from Kelvin to Others");
		System.out.println();
		System.out.println("Enter the option");
		int opt = sc.nextInt();
		switch(opt)
		{
			case 1: celsiusToOthers(sc);break;
			case 2: farhenheitToOthers(sc);break;
			case 3: KelvinToOthers(sc);break;
			default :
				System.out.println("Invalid input"); System.exit(0);break;
		}
		}
		
	}
	public static void celsiusToOthers(Scanner sc)
	{
			System.out.println("Enter the Temperature in Celsius");
			double temp = sc.nextDouble();
			System.out.println("Farhenheit:  " +(temp * 9 / 5 + 32));
			System.out.println("Kelvin :  "+(temp+273.15));
	}
	public static void farhenheitToOthers(Scanner sc)
	{
			System.out.println("Enter the Temperature in Farhenheit");
			double temp = sc.nextDouble();
			System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
			System.out.println("Kelvin: " + ((temp - 32) * 5 / 9 + 273.15));
	}
	public static void KelvinToOthers(Scanner sc)
	{
			System.out.println("Enter the Temperature in Celsius");
			double temp = sc.nextDouble();
			 System.out.println("Celsius: " + (temp - 273.15));
			System.out.println("Fahrenheit: " + ((temp - 273.15) * 9 / 5 + 32))	;
	}
}
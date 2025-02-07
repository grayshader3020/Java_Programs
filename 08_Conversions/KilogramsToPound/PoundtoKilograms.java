import java.util.Scanner;
class PoundtoKilograms{
	public static void main(String[] args) {
		System.out.println("Enter the amount in Pounds");
		float inPounds = new Scanner(System.in).nextFloat();

		float result = inPounds * 0.454f;
		System.out.println(inPounds + " Pounds in Kilogram is " + result + " Kilograms");  
	}
}
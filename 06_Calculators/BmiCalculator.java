import java.util.Scanner;

class BmiCalculator{
	public static void main(String[] args) {
		System.out.println("Enter your weight in Pounds");
		float weight = new Scanner(System.in).nextFloat();
		System.out.println("Enter your height in inches");
		float height = new Scanner(System.in).nextFloat();
		float wInKgs = weight* 0.4535f;
		float heightInMeter = height * 0.0254f;

		float bmi = wInKgs/((heightInMeter)*(heightInMeter));

		System.out.println("Your body mass index is " + bmi);

	}
}  

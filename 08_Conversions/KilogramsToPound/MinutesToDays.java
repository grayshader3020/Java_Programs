// convert the minutes given by user to days if year is of 365 days

import java.util.Scanner;
class  MinutesToDays{
	public static void main(String[] args) {
		int min = new Scanner(System.in).nextInt();

		int numberOfHours = min/60;
		int numberOfDays = numberOfHours/24;

		System.out.println("The number of days is " + numberOfDays);

	}
}
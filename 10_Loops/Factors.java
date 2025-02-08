import java.util.Scanner;
class Factors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find the factors of : ");
		int num=sc.nextInt();
		for (int i=2;i<num ;i++) { //as of the number is divisible by itself and one so 1 and num are not included in range
			if (num%i==0) {  // if the entered number is divisible by the number in range of i
				System.out.print(" "+ i);
			}
		}
	}
}
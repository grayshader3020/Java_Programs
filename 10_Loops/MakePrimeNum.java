import java.util.Scanner;
class MakePrimeNum{
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt(); //4
		boolean flag= true;
 		for (int i=2;i<num ;i++) {

			if (num%i==0) {
				flag= false;
				// num =5
				num++;
				i=1;
			}
		}
		System.out.println("The prime number is : "+num);		
	}
}

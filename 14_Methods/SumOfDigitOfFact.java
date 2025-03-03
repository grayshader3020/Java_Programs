import java.util.Scanner;
class SumOfDigitOfFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int op =fact(num);
		System.out.println("Sum of Factorial of digits is :"+sum(op));	
	}
	public static int fact(int num)
	{
		int fact= 1;

		for (int i=num;i>0;i-- ) {
			fact *=i;	
		}
		return fact;
	}
	public static int sum(int num)
	{
	    int sum= 0;
		for (int i=num;i>0;i/=10) {
			sum += (i%10);
		}
		return sum;
	}
}
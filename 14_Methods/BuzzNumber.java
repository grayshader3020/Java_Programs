import java.util.Scanner;
class BuzzNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int num = sc.nextInt();
		buzz(num);
	}
	public static void buzz(int num ) 
	{
		if ((num%7==0)||(num%10==7)) 
		{
			System.out.println(num+" is a Buzz Number");
		}
		else
		{
			System.out.println(num+" is not a Buzz Number");
		}
	}
}
import java.util.Scanner;
class PalindromicPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check  : ");
		int ip = sc.nextInt();
		if (ip == reverse(ip)&& isPrime(reverse(ip))) {
			System.out.println("It is a Palindromic Prime");
		}
		else{
			System.out.println("Its not");
		}
	}
	
	public static int reverse(int num)
	{
		int rev= 0;
		while(num!=0)
		{
			rev = rev*10+(num%10);
			num /=10;
		}
		return rev;
	}

	public static boolean isPrime(int num)
	{
		int den=2;
		for (;den<num;den++ )
	    {
			if(num%den==0)
			{
				break;
			}		
		}

		return num==den;
	}
}
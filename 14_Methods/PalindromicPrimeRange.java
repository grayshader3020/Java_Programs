import java.util.Scanner;
class PalindromicPrimeRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range to check  : ");
		int range = sc.nextInt();
		for (int start=1;start<=range ;start++ ) {
			if (start==reverse(start) && isPrime(reverse(start))) {
				System.out.println(start);
			}
		
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
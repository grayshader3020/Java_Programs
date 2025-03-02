import java.util.Scanner;

class Armstrong
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check");
		int num = new Scanner(System.in).nextInt();
		armstrong(num);
	}
	public static void armstrong(int a)
	{
		int length =0 , sum=0 , temp =a,dup=a;
		//for length
		while(temp>0)
		{
			length++;
			temp /=10;
		}

		//loop to fetch and extract last digit
		while(a>0)
		{
			int rem = a%10;
			int pow = 1;
			for (int i=1;i<=length ;i++ ) 
				pow *=rem;

			sum += pow;
			a /=10;
		}
		System.out.println(dup==sum?dup+" is a Armstrong number":dup+" is not a Armstrong number");
	}
}
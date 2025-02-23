import java.util.Scanner;
class BouncyNumber{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num , a=0,b=0;
		//bouncy number should be greater than 100 
		if (num<=100)
		{
			System.out.println("Its not a Bouncy Number");
		}
		else
		{
			int rem1 = dup%10;
			dup/=10;
			while(dup>0)
			{
				int rem2 = dup%10;
				if(rem1>rem2)
				{
					a=1;
				}
				else if(rem1<rem2)
				{
					b=1;
				}
				rem1 = rem2;
				dup /=10;
			}
			if (a==1 && b==1) 
			{
				System.out.println("Its a bouncy Number ");
			}
			else
			{
				System.out.println("Its not a bouncy number");
			}
		}
		
		
	}
}
import java.util.Scanner;
import java.util.*;
class PrimeNumber
{
	public static void main(String[] args)
    { 
    	System.out.println("Enter the number you want to check : ");
    	int num = new Scanner(System.in).nextInt();
    	prime(num);

	}
	public static void prime(int a) 
	{
		boolean flag = true;
		if (a<=1) {
			flag =false;
		}
		for (int i=2;i<Math.sqrt(a) ;i++ )
	    {
	    	if (a%i==0)
	        {
	        	flag =false;
				break;	    		
	    	}
		}
		if (flag)
	    {
	    	System.out.println("The number "+a+" is a prime number");
			
		}
		else
		{
			System.out.println("The number "+a+" is not a prime number");
		}
		
	}
}
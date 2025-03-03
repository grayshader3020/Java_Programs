import java.util.Scanner;
class NumberFrequency
{
	public static void main(String[] args)
    {	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number");
    	long num = sc.nextLong();
		count(num);
	}
	public static void count(long num)
	{
		for (long i=0;i<=9 ;i++)
	    {
			int cnt=0;
			for (long j =num;j>0;j/=10 ) {
				//System.out.println(" i : "+i+" j : "+(j%10));
				if (i == (j%10)) {
					cnt++;
				}
			}
			if (cnt!=0) 
			{
				System.out.println(i+" : "+cnt);
			}
		}		
	}
}
	
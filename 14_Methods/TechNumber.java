import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check : ");
		int num = sc.nextInt();
		techNumber(num);
	}
	public static void techNumber(int a)
	{
		int len=0,div=1 ,dup=a;
		for(int i=a;i>0;i/=10){
			len++;
		}
		if (len%2==0) 
		{
			for (int i=1;i<=(len/2);i++ ) 
			{
				div *= 10;
			}
			int fh = a/div;
			int lh = a%div;
			int sum = fh+lh;
			int sqr = sum*sum;

			System.out.println((sqr==dup)?dup+ " is a Tech Number":dup+ " is not a Tech Number");
		}

	}
}
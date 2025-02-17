import java.util.Scanner;
class RangePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Num :");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Num :");
		int num2 = sc.nextInt();
		for (int i = num1;i<=num2 ;i++ )
		{
			boolean flag = true;
				if (i<=1)
				{
					flag = false;
				}
				else{
					for (int j = 2;j<=i/2 ;j++ )
					{
						if(i%j==0){
							flag = false;
							break;
						}
					}
				}
				if (flag)
				{
					System.out.println(i);
				}
		}
	}
}
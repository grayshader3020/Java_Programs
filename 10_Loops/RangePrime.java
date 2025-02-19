import java.util.Scanner;
class RangePrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Num :");
		int num1 = sc.nextInt(); // 3  // STARTING RANGE
		System.out.println("Enter the 2nd Num :");
		int num2 = sc.nextInt(); // 6  // ENDING RANGE
		//            3    3<=6
		for (int i = num1;i<=num2 ;i++ )
		{
			boolean flag = true;
			//iter1 3<=1
				if (i<=1)  // CHECKS WHETHER THE NUMBER IS LESS THAN 1
				{
					flag = false;
				}
				else{
					//checks for prime number
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
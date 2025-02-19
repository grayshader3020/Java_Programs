import java.util.Scanner;
class DangerNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String name = sc.next();
		int count = 0;
		int count1 = 0;
		for(int i = 0 ; i <name.length();i++)
		{
			
			if(name.charAt(i)=='1')
			{
				count1=0;
				count++;
				if(count==7)
					break;
			}
			if(name.charAt(i)=='0')
			{
				count=0;
				count1++;
				if(count1==7)
					break;
			}
		}
		if(count>=7 || count1>=7)
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("No");
		}
	}
}
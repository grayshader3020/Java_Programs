import java.util.Scanner;
class DangerAnotherLogic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String name = sc.next();
		String str1= "";
		String str0 = "";
		boolean flag=false;
		for(int i = 0 ; i <name.length();i++)
		{
			
			if(name.charAt(i)=='1')
			{
				str1 = str1+name.charAt(i);
				str0 =" ";
				//count++;
				if(str1.length()>=7)
				{
					flag=true;
					break;
				}
			}
			if(name.charAt(i)=='0')
			{
				str0 = str0+name.charAt(i);
				//count=0;
				str1="";
				if(str0.length()>=7)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("No");
		}
	}
}
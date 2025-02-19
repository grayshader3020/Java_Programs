import java.util.Scanner;
class TestA_AA_STRING 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String : ");
		String name = new Scanner(System.in).next();
		long num = 0;
		for(int i = 0 ; i<name.length();i++)
		{
			num = num * 26 + name.charAt(i)-64;
		}
		System.out.println(num);
	}
}
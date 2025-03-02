import java.util.Scanner;
class Power{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();	

     	System.out.println("Enter the power : ");
		int b = sc.nextInt();
		pow(a,b);
	}

	public static int pow(int p ,int q)
	{
		int op =1;
		for (int i=1;i<=q;i++) 
		{
			op *= i;
		}
		System.out.println("The number "+ p +" with power"+q+" is "+op);

	}
}
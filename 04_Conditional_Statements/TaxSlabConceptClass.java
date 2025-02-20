import java.util.Scanner;
class TaxSlabConceptClass
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Amount : ");
		double money = new Scanner(System.in).nextDouble();
		final int miniMoney = 1200000;
		if(money>=0 && money<=1200000)
		{
			System.out.println("You don't need to be pay tax");
		}
		else if(money>1200000 && money<1600000)
		{
			System.out.println("You have to be pay tax : "+((money-miniMoney)*0.12));
		}
		else if(money>1600000 && money<2000000)
		{
			System.out.println("You have to be pay tax : "+((money-miniMoney)*0.2));
		}
		else if(money>2000000 && money<2400000)
		{
			System.out.println("You have to be pay tax : "+((money-miniMoney)*0.25));
		}
		else if(money>2400000)
		{
			System.out.println("You have to be pay tax : "+((money-miniMoney)*0.3));
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
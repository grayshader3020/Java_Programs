class CurrencyConverter
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		rupeeToDollar(100.0);
		System.out.println("main ends");
	}
	public static void rupeeToDollar(double rup)
	{
		System.out.println("rupee to dollar start");
		double dollar =rup/187.15;
		System.out.println(dollar);
		dollarToEuro(dollar);
		System.out.println("rupee to Dollar ends");
	}
	public static void dollarToEuro(double dollar)
	{
		System.out.println("dollar to Euro starts");
		double euro = dollar*0.95;
		System.out.println(euro);
		System.out.println("dollar to Euro ends");
	}
	public static void euroToDhiram(double euro)
	{
		System.out.println("euro to Dhiram starts");
		double dhiram = euro*3.85;
		System.out.println(dhiram);
		System.out.println("euro to Dhiram ends");
	}
}
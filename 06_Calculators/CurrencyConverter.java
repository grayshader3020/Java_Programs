import java.util.Scanner;

class CurrencyConverter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("	CURRENCY CONVERTER");
		System.out.println();
		System.out.println("Enter the amount(INR): ");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. AUD");
		System.out.println("6. DKK");
		System.out.println();
		System.out.println("Choose the Currency for Conversion: ");
		String curr= sc.next().toUpperCase();
		float conCurr = 0.0f; 

		if(curr.equals("USD")){
			System.out.println("USD");
			conCurr = inr/86.56f;
			System.out.println(inr +" INR "+ conCurr + " USD");
		}
		else if(curr.equals("EUR")){
			System.out.println("EUR");
			conCurr = inr/90.25f;
			System.out.println(inr +" INR "+ conCurr + " EUR");
		}
		else if(curr.equals("GBP")){
			System.out.println("GBP");
			conCurr = inr/107.66f;
			System.out.println(inr +" INR "+ conCurr + " GBP");
		}
		else if(curr.equals("PKR")){
			System.out.println("PKR");
			conCurr = inr/0.31f;
			System.out.println(inr +" INR "+ conCurr + " PKR");
		}
		else if(curr.equals("AUD")){
			System.out.println("AUD");
			conCurr = inr/54.09f;
			System.out.println(inr +" INR "+ conCurr + " AUD");
		}
		else if(curr.equals("DKK")){
			System.out.println("DKK");
			conCurr = inr/12.10f;
			System.out.println(inr +" INR "+ conCurr + " DKK");
		}
		else{
			System.out.println("INVALID OPTION");

		}

	}
}
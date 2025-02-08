import java.util.Scanner;
class FactorialDigitSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to find factrial sum of: ");
		int num = sc.nextInt(); //  123456  calculate factorial of each digit and sum up them 	
		int sum =0;
		int dup = num;

		while(num>0){
			int rem = num % 10; // in rem =123456 % 10 => 6
			int fact =1; // this is for factorial
			int prod = 1;
 			//factorial logic for a single digit stored in rem 
			for(int i =rem ;i>=1;i--){
				fact *=i;
			}
			sum += fact;
			num/=10; // updation num=123456 /10 => 6
			
		}

		System.out.println("The original number is: "+ dup);
		System.out.println("Sum of the factorial of each digit is "+sum);
	}
	
}
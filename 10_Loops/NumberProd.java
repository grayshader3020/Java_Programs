import java.util.Scanner;
class NumberProd{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int prod=1;
		while(num>0){
			int rem = num%10;
			prod *=rem;
			num /=10;
		}
		System.out.println("The product of the number is: "+prod);
		System.out.println(dup);
	}
	
}
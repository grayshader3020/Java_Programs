import java.util.Scanner;
class SpyNumber{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		int num = new Scanner(System.in).nextInt();
		int prod =1;
		int sum =0;

		for (int j=num;j>0 ;j/=10 ) {
				int rem =j%10;
				sum +=rem;
				prod *=rem;
			}
		
		System.out.println((sum==prod)?(num+" is a Spy number"):(num+" is not a Spy number"));
	}
			
}

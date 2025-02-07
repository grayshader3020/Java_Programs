import java.util.Scanner;
class NumberExample1{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum=0;
		while(num>0){
			int rem = num%10;
			if(rem%2==0){
				sum +=rem;
			}
		   num/=10;
		}
		System.out.println("sum of even numbers is: "+sum);
		System.out.println("The original number is "+dup);
	}
	
}
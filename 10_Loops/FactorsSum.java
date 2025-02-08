import java.util.Scanner;
class FactorsSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factors sum you want: ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i =2; i<num;i++ ) {
			if (num%i==0) {
				//System.out.println(" "+i);
				sum +=i;
			}
		}
	    System.out.println("The sum of factors of "+num+" is "+sum);
	}
}
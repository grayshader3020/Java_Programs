import java.util.Scanner;
class Krishnamurthy{
	public static void main(String[] args) {
		System.out.println(" Enter any number :");
		int num =new Scanner(System.in).nextInt();  // 174
		int sum = 0;        
		for (int i=num;i>0;i/=10) {
			int rem=num%10; //rem=4
			int fact=1;
		
			for (int j=1;j<=rem;j++) {
				fact *= j; // 1,2,3,4,5
				sum += fact;
			}
		}
			
			System.out.println(sum==num?" Krish Number":"Not a Krish Number");
	}
}
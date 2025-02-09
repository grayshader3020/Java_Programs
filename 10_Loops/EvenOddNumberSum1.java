import java.util.Scanner;
class EvenOddNumberSum1{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt(); //123
		int dup = num; 
		int evensum=0;
		int oddsum=0;
		while(num>0){ //123>0
			int rem = num%10; //rem => 123%10 => 3
			if(rem%2==0){ //3%2==0 (False) => else
				evensum +=rem;
			}
			else{
				oddsum += rem; 
			}
		   num/=10;
		}
		System.out.println("sum of even numbers digits in a number is : "+evensum);
		System.out.println("sum of odd numbers digits in a number is : "+oddsum);
		System.out.println("The original number is "+dup);
	}
	
}
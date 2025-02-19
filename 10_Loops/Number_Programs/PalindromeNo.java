import java.util.Scanner;
class PalindromeNo{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check if its palindrome");
		int num =new Scanner(System.in).nextInt();
		int dup = num;
		int rev =0;	
		for (int i=num;i>0 ;i/=10) 
			 rev = rev*10+(i%10);
		if(rev == dup){
			System.out.println("The entered number was "+dup+" and its reverse num is "+rev);
			System.out.println("The entered number "+rev +" is a palindrome number");
		}
		else{
			System.out.println("The entered number "+ dup +" is not palindrome number");
		}
	}
}
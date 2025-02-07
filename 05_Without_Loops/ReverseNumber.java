import java.util.Scanner;

class ReverseNumber{
	public static void main(String[] args) {
		System.out.println("Enter any 3 digit number");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		/* 
	    	%10 => gives last value as in rem
	    	*10 => moves or shifts to one place left
	    	/10 => removes last digit
	    */
		int rem = num%10;  // 123 % 10 => 3
	    rev = rev*10+rem;  //  0*10+3 => 3
	    num = num/10;

	    rem = num%10;  // 12 % 10 => 2
	    rev = rev*10+rem;  //  3*10+2 => 32
	    num = num/10;	

		rem = num%10;  // 1 % 10 => 1
	    rev = rev*10+rem;  //  32*10+1 => 321
	
		System.out.println(dup +" = "+ rev);

		
	}
}
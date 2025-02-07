class EvenOddSum{
	public static void main(String[] args) {
		int num =12345;
		int evenSum =0;
		int oddSum =0;
		int temp =0;

		int rem = num%10 ; //5
		temp = (rem%2==0)?(evenSum =evenSum + rem):(oddSum =oddSum + rem); 
		num = num/10; //1234
		
		rem = num%10 ; // 4
		temp =(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num = num/10; //123

		rem = num%10; //3
		temp =(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num = num/10; // 12

		rem = num%10; //2
		temp =(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);
		num = num/10; //1

		rem = num%10; //1
		temp =(rem%2==0)?(evenSum=evenSum+rem):(oddSum=oddSum+rem);

		System.out.println("Even Sum is "+ evenSum);
		System.out.println("Odd Sum is "+   oddSum);

	}
	
}
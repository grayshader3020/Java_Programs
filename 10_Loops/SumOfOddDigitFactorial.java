class SumOfOddDigitFactorial{
	public static void main(String[] args) {
		int num = 123;
		int dup = num;
		int sum =0;
		while(num>0)
		{
			int rem = num%10;// rem =3
			int fact = 1;
			if (!(rem%2==0)){  // if rem is odd then and then only find factors
					for (int i = rem ;i>=1 ;i-- ) {
					fact*=i;
				   }
			sum += fact;
		}
			num /=10;
		}
		System.out.println("The sum of factorial of  odd digits of a number:"+ dup+ " is "+ sum );
		}
	}

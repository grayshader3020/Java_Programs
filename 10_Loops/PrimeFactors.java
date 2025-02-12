class PrimeFactors 
{
	public static void main(String[] args) 
	{
		int num =6;
		int cnt = 0;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				System.out.println(i);
				//num = num/i;
			}

		}
			
	}
}
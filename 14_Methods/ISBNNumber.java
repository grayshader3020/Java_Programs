class ISBNNumber
{
	public static void main(String[] args) 
	{	
		long a= 1566199093l;
		isbn(a);
	}
	public static void isbn(long num)
	{
		long dup =num,sum =0;
		for (long i=num,j=1;i>0&&j<=10;i/=10,j++) 
		{
			long rem = i%10;
		    sum +=(rem*j);
		}
		if (sum%11==0) 
		{
			System.out.println(dup +" is a ISBN number ");
		}
		else
		{
			System.out.println(dup +" is not a ISBN number ");
		}
	}
}
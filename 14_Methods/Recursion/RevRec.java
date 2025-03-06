class RevRec
{
	public static void main(String[] args)
	 {
		System.out.println(reverse(123,0));
	}
	public static int reverse(int num , int rev)
	{
		if (num!=0)
	    {
	    	rev=rev*10+(num%10);
	    	reverse(num/10,rev);
		}
		else if (num==0)
	    {
	    	System.out.println(rev);
		}
		return rev;
	}
}
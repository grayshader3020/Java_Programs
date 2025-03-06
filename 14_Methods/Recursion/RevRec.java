class RevRec
{
	public static void main(String[] args)
	 {
		System.out.println(reverse(123,0));
	}
	public static int reverse(int num , int rev)
	{
		if (num==0) {
			return rev;
		}

		return reverse(num/10,rev*10+(num%10));
	}
}
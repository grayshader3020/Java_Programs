class reverseString
{
	public static void main(String[] args) 
	{
		System.out.println(reverse("admin"));
	}
	public static String reverse(String str)
	{	
		String rev ="";
		for (int i=0;i<str.length();i++ ) 
		{
			rev = str.charAt(i)+rev;
		}
		return rev;
	}
}
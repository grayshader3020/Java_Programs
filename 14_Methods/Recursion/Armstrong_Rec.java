class Armstrong_Rec
{
	public static void main(String[] args) 
	{
		System.out.println(SumofDigit(153,153,0));
	}
	public static boolean SumofDigit(int num,int temp , int sum)
	{
		return temp==0?(num==sum):SumofDigit(num,temp/10,(sum += pow((temp%10),count(num,0))));
	}
	public static int count(int num,int ct)
	{
		return num==0?ct:count(num/10,++ct);
	}
	public static int pow(int base,int raise)
	{
		return raise==0?1:base*pow(base,raise-1);
	}
}
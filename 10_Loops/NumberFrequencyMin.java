/* inner loop to extract the digits from given number and the outer
loop is to match the extracted digit with the regular digits 0-9*/
class NumberFrequencyMin{
	public static void main(String[] args) 
	{
		long num = 1234556754573l;
		System.out.println(num);
		long min=9;
		long dgt=0;
		for (long i=0;i<=9;i++){
			int cnt=0;
			for (long j=num;j>0;j/=10 ) {
				long rem= j%10;
				if (i==rem) {
					cnt++;
				}
			}
	
			if (cnt!=0) 
			{
				//System.out.println("Checking digit(i): " + i + ", Frequency(cnt): " + cnt+", Minimum digit(min): "+min);

				if (min>cnt){
					min=cnt;
					dgt=i;
				}
			}
		}	
		/* this works on first come first serve logic where the first freq it gets as min it adds the allied number to the 
		record and doesnt change if any other number is also having frequency of 1*/
	    System.out.println("min digit is "+dgt+" with a frequency of "+ min);
	}
}
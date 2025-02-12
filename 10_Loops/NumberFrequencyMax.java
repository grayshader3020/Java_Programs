/* inner loop to extract the digits from given number and the outer
loop is to match the extracted digit with the regular digits 0-9*/
class NumberFrequencyMax{
	public static void main(String[] args) 
	{
		long num = 1234556754573l;
		System.out.println(num);
		long 	 max =0;
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
				  System.out.println("Checking digit: " + i + ", Frequency: " + cnt);

				if (max<cnt){
					max=cnt;
					dgt=i;
				}
			}
		}	
		//System.out.println("max digit is "+dgt+" with a frequency of "+ max);
	}
}
/* inner loop to extract the digits from given number and the outer
loop is to match the extracted digit with the regular digits 0-9*/
class NumberFrequency{
	public static void main(String[] args) {
		long num = 1345346464664l;
		System.out.println(num);
		for (int i=0;i<=9 ;i++ ) {
			int cnt=0;
			for (long j=num;j>0;j/=10 ) {
				long rem= j%10;
				if (i==rem) {
					cnt++;
				}
			}
			if (cnt!=0) {
				System.out.println(i+" : "+cnt);
			}
		}
	}
}
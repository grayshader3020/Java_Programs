//79     108   139    176  217   260 
//  + 29    +31   +37   +41   +43 prime numbers
class NumberSeries3{
	public static void main(String[] args) {
		int num =79;
		int primeNo=29;
		for (int i=0;i<6;i++ ) {
			System.out.print(num+" ");
			num += primeNo;// 108
		}
		//             29+1=30
		int nxtPrime= primeNo+1;
		while(true)
		{
			boolean flag= true;
			//jiter 1        2<=30
			for (int j=2;j<=nxtPrime;j++ ) {
				//   30%2==>0
				if (nxtPrime%j==0) {
					flag=false;
					break;
				}
			}
			if (flag) {
				   
				nxtPrime = primeNo;
				break;
			}
			nxtPrime++; // 31
		}
	}
 }

//  2     6     22    278    65814
//  2   2^2+2  2^4+6 2^8+22  2^16+278
class NumberSeries2{
	public static void main(String[] args) {
		int num1=2;
		System.out.print(num1 +" ");
		//iter1          2<=5
		for (int i=2,p=2;i<=5;i++,p*=2) {
			int pow =1;
		//jter1          0<2
			for (int j=0;j<p;j++ ) {
				pow *=2;// 2
			}
			System.out.print(pow+num1+" ");
			num1+=pow;
		}
	}
}
// 1  3  9  33 153 873
// 1 + (0*1) =1
// 1 + (1*2) =3
// 3 + (3*2) =9
// res +(i*j) = res
class NumberSeries4
{
	public static void main(String[] args) {
		int i =1;
		int res =1;
		for (int j=2;j<=7;j++ ) {
			System.out.print(res + " ");
			//System.out.println("i "+ i);
			//System.out.println("iter j "+ j);
			res = res +(i*j);
			i = i*j;
		}
	}
}
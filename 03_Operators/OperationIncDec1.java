class OperationIncDec1{
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=3;
		int d;

		a = (b++)-(--c);
		d = (++c)+(b--);
		c = (a++)+(--b)+(++d);

		System.out.println("a "+ a);
		System.out.println("b "+ b);
		System.out.println("c "+ c);
		System.out.println("d "+ d);

	}
}
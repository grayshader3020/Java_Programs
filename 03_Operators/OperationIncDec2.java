class OperationIncDec2{
	public static void main(String[] args) {
		int p=-1;
		int q=5;
		int r=17;
		int s;

		s=(p++)-(q--);
		s=s++;
		q=-p++ + r--;
		System.out.println("p "+ p);
		System.out.println("q "+ q);
		System.out.println("r "+ r);
		System.out.println("s "+ s);

	}
}
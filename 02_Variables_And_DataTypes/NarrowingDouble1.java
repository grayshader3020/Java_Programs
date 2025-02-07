class NarrowingDouble1{
	public static void main(String[] args) {
		double d = 1001.22948;
		float a = (float)d;
		System.out.println(a);

		long b = (long)d;
		System.out.println(b);

		int c = (int)d;
		System.out.println(c);

	
		char e = (char)d;
		System.out.println(e);

		short f = (short)d;
		System.out.println(f);

	}
}
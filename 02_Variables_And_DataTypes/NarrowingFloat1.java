class NarrowingFloat1{
	public static void main(String[] args) {
		float f = 12.34f;
		long b = (long)f;
		System.out.println(b);

		int c = (int)f;
		System.out.println(c);

		char e = (char)f;
		System.out.println(e);

		short g = (short)f;
		System.out.println(g);

		byte k = (byte) f;
		System.out.println(k);
	}
}
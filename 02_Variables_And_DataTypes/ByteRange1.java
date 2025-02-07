class Range1{
	public static void main(String[] args) {
		int max_byte = Byte.MAX_VALUE;
		int min_byte = Byte.MIN_VALUE;	

	    for(int i=0; i<129 ;i++){ 
			byte b = (byte)(max_byte + i);
			System.out.println("b: " + b);
		}

		//System.out.println(min_int);
		//System.out.println(max_int);
	}
}

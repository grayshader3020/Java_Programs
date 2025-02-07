class IntRange1{
	public static void main(String[] args) {
		int max_short = Short.MAX_VALUE;
		int min_short = Short.MIN_VALUE;	

	    for(int i=0; i<(max_short+1);i++){ 
			short b = (short)(max_short + i);
			System.out.println("i: " + b);
		}

	}
}
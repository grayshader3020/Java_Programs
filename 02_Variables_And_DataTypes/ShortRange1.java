class IntRange1{
	public static void main(String[] args) {
		int max_int = Integer.MAX_VALUE;
		int min_int = Integer.MIN_VALUE;	

	    for(int i=0; i<(max_int+1);i++){ 
			int b = (int)(max_int + i);
			System.out.println("b: " + b);
		}
	}
}   
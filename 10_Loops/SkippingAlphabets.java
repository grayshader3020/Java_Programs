class SkippingAlphabets{
	public static void main(String[] args) {
		int a=1;
		for (char ch='A';ch<='Z';ch+=a) {  //ch=ch+a =>A=>A+2=>C
			System.out.print(ch);
			a++; // 2
		}
	}
}
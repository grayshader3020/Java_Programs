import java.util.Scanner;
class MaxDigitNumber{
	public static void main(String[] args) {
		int num =new Scanner(System.in).nextInt();
		int max =0;
		for (int i=num;i>0 ;i/=10 ) {
			int dgt= i%10;
			if (max<dgt)
				max = dgt;
		}
		System.out.println("largest dgt from "+num +" is "+max);
	}
}
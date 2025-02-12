import java.util.Scanner;
class RajaSoft{
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int num = new Scanner(System.in).nextInt();
		int pprime=0;
		int nprime=0;
		for (int i=num-1;i>=2;i-- ) {
			boolean flag = true;
			for(int j=i;j>1;j--){
				if (i%j==0) {
					System.out.println(j);
				}
			}
		}
	}
}
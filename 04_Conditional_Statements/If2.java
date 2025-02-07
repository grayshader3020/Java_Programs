import java.util.Scanner;
class If2{
	public static void main(String[] args) {
		System.out.println("Are you a paid student? ");
		boolean ip = new Scanner(System.in).nextBoolean();
		if(ip){
			System.out.println("Pay the fees");
		}
		System.out.println("Do the class ");
	}
}
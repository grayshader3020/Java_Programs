import java.util.Scanner;

class Looping_Username{
	public static void main(String[] args)
    throws InterruptedException  {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter your name");
		String ch = sc.next().toUpperCase();
		int len = ch.length();
		
		for(int i=0;i<=len-1;i++){
			System.out.println(ch.charAt(i));
			Thread.sleep(1000);
		}
	}
}
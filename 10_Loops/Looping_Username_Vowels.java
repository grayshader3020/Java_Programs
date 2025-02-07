import java.util.Scanner;

class Looping_Username_Vowels{
	public static void main(String[] args)
    throws InterruptedException  {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter your name");
		String ch = sc.next().toUpperCase();
		int len = ch.length();
		
		for(int i=0;i<=len-1;i++){
			char let = ch.charAt(i);
			//System.out.println(let);
			if(let =='A'||let =='E'||let=='I'||let =='O'||let=='U'){
				System.out.println(let + " is a vowel");
			}
		}
	}
}
import java.util.Scanner;

class VowelChecker{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character you want to check");
		char ch = sc.next().charAt(0);

		String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch +" is a vowel"):(ch +" is a consonent");
		System.out.println(op);
	}
}
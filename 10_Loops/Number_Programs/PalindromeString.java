import java.util.Scanner;
class PalindromeString{
	public static void main(String[] args) {
		System.out.println("Enter the String to check whether it is palindrome");
		String s = new Scanner(System.in).next();
		String dup = s;
		String rev = "";
		for (int i=0;i<s.length();i++ )
			rev = s.charAt(i)+rev;
		if(rev.equals(dup))
			System.out.println("The string "+dup+" is a palindrome string");
		else
			System.out.println("The String "+dup+" is not a palindrome string");
	}
}
import java.util.Scanner;
class ReverseString{
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		String s = new Scanner(System.in).next();
		String rev = "";
		//int len = s.length();
		//System.out.println(len);
		for (int i=0;i<s.length();i++) {
			rev = s.charAt(i)+ rev; 
		}
		System.out.println("The reverse of the String is "+rev);
	}
}
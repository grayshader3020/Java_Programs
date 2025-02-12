import java.util.Scanner;
class ReverseString1{
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		String str = new Scanner(System.in).next();
		//with inbuilt function
		StringBuffer rev = new StringBuffer(str);
		System.out.println("The reverse of the String is "+rev.reverse());
	}
}
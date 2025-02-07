import java.util.Scanner;

class Circle1{
	public static void main(String[] args) {
		final double pi = 22/7;
		Scanner sc = new Scanner(System.in);
	    double result;
	    int r;
	    System.out.println("Enter the radius of circle");
	    r = sc.nextInt();
	    result = pi*r*r;
	    System.out.println("The area of circle having radius "+ r + " is " +  result);
	}
}

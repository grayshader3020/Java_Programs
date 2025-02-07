import java.util.Scanner;

class Cylinder_All{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Cylinder");
		float radius = sc.nextFloat();
		System.out.println("Enter the height of Cylinder");
		float height = sc.nextFloat();
		final float pi = 22/7f;

		float area = pi*radius*radius;
	    float volume = area*height;

	   System.out.println("The area is " + area);
	   System.out.println("The volume is " + volume);


	}
}
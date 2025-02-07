import java.util.Scanner;

class PassOrFail{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total marks ");
		int total = sc.nextInt();
		System.out.println("Enter the marks obtained ");
		int marks = sc.nextInt();
		float percent = (marks/total)*100;
		String op =(percent>=75 && percent<=100)?("You have 'A' grade"):((percent>=60 && percent<=60)?("You have 'B' grade"):(percent>=35 && percent<=60)?("You have 'C' grade"):"Failed");
		System.out.println(op);
	}
}
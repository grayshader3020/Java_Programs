import java.util.Scanner;

class Season{
	public static void main(String[] args) {
		System.out.println("Enter the inital three Characters of the month for checking");
		String s = new Scanner(System.in).nextLine().toUpperCase();

		String op =(s.equals("OCT")||s.equals("NOV")||s.equals("DEC")||s.equals("JAN"))?("Winter"):
				   (s.equals("FEB")||s.equals("MAR")||s.equals("APR")||s.equals("MAY"))?("Summer"):
				   (s.equals("JUN")||s.equals("JULY")||s.equals("AUG")||s.equals("SEP"))?("Mansoon"):
				   ("Invalid month");

		System.out.println(op);

	}
}
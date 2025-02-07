import java.util.Scanner;
class MonthToYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float months= sc.nextFloat;
		float years = months/12;
		float rem = months%12;
		System.out.println(years+rem);
	}
}

/*
1 =>0.1
2 =>0.2
12 => 1
14 => 1.2
15 => 1.3
16 => 1.4
17 => 1.5

*/
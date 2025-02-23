import java.util.Scanner;
class Descending{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to check : ");
		int num = sc.nextInt();
		int dup = num;
		// for first extraction
		int rem = dup%10; // 4
		dup /=10;// 123
		// assume its descending 
		boolean flag = true;
		while(dup>0){
			//   4  >=  3
			if (rem>=dup%10) {
				flag =false;
				break;
			}
			rem = dup%10;
			dup/=10;
		}
		if(flag)
			System.out.println(num + " digits are descending");
		else
			System.out.println(num + " digits are not descending");
	}
}
 
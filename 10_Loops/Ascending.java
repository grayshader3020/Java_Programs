import java.util.Scanner;
class Ascending{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num  = sc.nextInt(); // 1234
		int dup = num;
		// assume that number is moving asscendingly
		boolean flag = true;
		int rem = dup%10; //4 
		dup/=10;//123
		
		while(dup>0){
			//  4 <= 3
			if(rem<=dup%10){
				flag = false;
				break;
			}
			 rem = dup%10;//2 
		     dup /=10; // 1
		}

		if(flag)
			System.out.println(num + " digits are ascending");
		else
			System.out.println(num + "digits are not ascending");
	}
}
import java.util.Scanner;
class SunnyNumber{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		int num =new Scanner(System.in).nextInt();
		int nxtNum= num+1;
		int mul = 1;
		for (int i=1;i<=(nxtNum/2);i++) {
			mul = i*i;
			if (mul==nxtNum) {
				break;
			}
		}
		String op = (mul == nxtNum)?(num+" is a Sunny Number"):(num+" is not a Sunny Number");
		System.out.println(op);
	}
}
import java.util.Scanner;
class Factors_PrimeOrNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt(); //5
		int cnt=0;
		for (int i=2;i<num ;i++)  //2,3,4,5
			if (num%i==0)  // 5%2==0
				cnt++;  //cnt = cnt+1 

		System.out.println("count: "+cnt);
		//if there are no factors of any number then it is a even number
		// so if the count of factors is 0 then the number is prime otherwise its not.
		System.out.println(cnt==0?num+" is prime":num+ " is not prime");
	}
}
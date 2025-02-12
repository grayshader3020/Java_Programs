import java.util.Scanner;

class EvenOddConverter{
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int cnt = 0;
		/* loop to get the count of digit 
		every iter we remove a digit and 
		we do the task until the num is zero
		and cnt in every iter is incre by 1*/
		while(num>0){
			cnt++; //incre the cnt by one in every iter
			num/=10;// every we update the num dn last num becomes zero
		}

		String newNum = "";
		if (cnt%2==0) { //if the len is even
			for (int i=dup;i>0 ;i/=10 ) {
				int rem = i%10;
				if (rem%2!=0) { //rem => 3
					           //6 + "4"
					newNum = ++rem + newNum;
				}
				else{
					newNum = rem + newNum;
				}
			}	
		}
		else { //if the len is odd
			for (int i=dup;i>0 ;i/=10 ) {
				int rem = i%10;
				if (rem%2==0) { //rem => 3
					           //6 + "4"
					newNum = ++rem + newNum;
				}
				else{
					newNum = rem + newNum;
				}
			}	
		}

		System.out.println(dup+" : "+newNum);
	}
}
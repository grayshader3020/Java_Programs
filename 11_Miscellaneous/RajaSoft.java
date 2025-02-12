import java.util.Scanner;
class RajaSoft{
	public static void main(String[] args) {
		System.out.println("Enter the number "); //6
		int num = new Scanner(System.in).nextInt();
		int pprime=0;
		int nprime=0;
		//iter1    i=5   5>=2
		//iter2    i=4   4>=2
		//iter3    i=3   3>=2
		//iter4    i=2   2>=2
		// loop for previous prime number
		for (int i=num-1;i>=2;i-- ) {// loop to traverse from num-1 to 2 like 5,4,3,2,1 if num is 6
			boolean flag = true;
			//iter1     j=2<5
			//iter2     j=3<5
			//iter3     j=4<5
			//iter4     j=5<5
			for(int j=2;j<i;j++){  // loop to check whether the number is the above loop is non prime
				// 2,3,4,2,3,2
				if (i%j==0) {
				 	//if the condition is true that means the number is divisible by anything and is non prime\
				 	flag=false;
				 	break;
				 } 

			}		
			if (flag) {
				pprime = i;
				break;
			}
		}

			//loop for next prime number
			for (int i=num; ;i++ ) {
			    boolean flag = true;
				for(int j=2;j<i;j++) {
				    flag = false;
					break;
				}
			
			if (flag) {
				nprime = i;
				break;
			}
		}
		
		// distance from the actual number provided 
		if (num-pprime<nprime-num) {
			System.out.println(pprime+" "+num);
		}
		else if (num-pprime>nprime-num) {
			System.out.println(num+" "+nprime);
		}
		else
			System.out.println(pprime+" "+num+" "+nprime);
	}
}
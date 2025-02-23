import java.util.Scanner;
import java.util.*;

class BouncyNumber{
	public static void main(String[] args) {
		System.out.println("Enter a number you want to check");
		int num = new Scanner(System.in).nextInt();
		String str = Integer.toString(num);
		boolean flag = true;
		// for decreasing
		boolean isDecreasing=false;
		for (int i=0;i<str.length()-1;i++){
			char digit  = str.charAt(i);
			//System.out.println(digit);
			if(digit<str.charAt(i+1))
			{
				flag = false;
				isDecreasing=true;
				break;
			}
		}
		//for increasing
        boolean isIncreasing=false;
		for (int i=0;i<str.length()-1;i++){
			char digit  = str.charAt(i);
			//System.out.println(digit);
			if(digit>str.charAt(i+1))
			{
				flag = false;
				isIncreasing=true;
				break;
			}
		}

		if(flag&&!(isDecreasing)&&!(isDecreasing))
			{
				System.out.println(num + " is a bouncy number");
			}
		else{
				System.out.println(num + " is not a bouncy number");
			}
	}

}

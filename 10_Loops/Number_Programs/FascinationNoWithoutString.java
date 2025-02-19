import java.util.Scanner;
class FascinationNoWithoutString{
	public static void main(String[] args) {
		System.out.println("Enter the number you want to check");
		int num =new Scanner(System.in).nextInt();
		int dup = num;
		int temp = num;
		int cnt=0;
		int count =0;
		boolean flag = false;

		// to find the length
		for (int i=num;i>0;i/=10) 
			cnt++;

		// loop for multiplying with 2 and 3
		for (int i=2;i<=3 ;i++ ) {
			num = (num*1000)+(temp*i);
			//System.out.println(num);
		}

		// fetching the last digit and comparing
		for (int i=1;i<=9;i++) {
		    for (int j=num;j>0;j/=10)
		    {
			  	int rem =j%10;
			  	//System.out.println("i = " + i + "  rem = " + rem);
			  	if(i==rem)
			  		count++;			  		
		    }
		    //System.out.println();
		    if (count!=1) // if cnt of char is not equals to 1 then if executes
			{
			  flag=true;  // re inti the flag is cnt is not equals to 1
			  break; //terminate the loop
			}
		}
		if (flag)
		{
				System.out.println(dup +" is a fascinating number");	
		}
		else
		{
				System.out.println(dup +" is  not a fascinating number");
		}	
	}
}
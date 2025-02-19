w/* An Armstrong number is a number that equals the sum of its digits raised to the power of the number of digits 
example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.  here length=3 so ^3*/
class Armstrong{
	public static void main(String[] args) {
		int num = 153 , length=0 ,sum=0;
		int dup = num; 
		for (int i=num;i>0 ;i/=10 )
			length++; // to count the length of number her length is 3
		while(num>0){
			int rem = num%10;  //rem =3
			int pow = 1; 
			//iter1           1<=3
			//iter2           2<=3
			//iter3           3<=3
			for (int i=1;i<=length ;i++ ) 
	   //iter1  pow = 1*3 =3  // whileiter2 pow =1*5          // whileiter3 pow =1*1
	   //iter2  pow = 3*3 = 9 // whileiter2 pow = 5*5         // whileiter3 pow = 1*1
	   //iter3  pow = 9*3 = 27 // whileiter2 pow = 25*5= 125  // whileiter3 pow =1*1
				pow *=rem;
			sum += pow; // 27+125+1 => 153
			num /=10;
		}
		System.out.println(dup==sum?dup+" is a Armstrong number":dup+" is not a Armstrong number");


	}
}
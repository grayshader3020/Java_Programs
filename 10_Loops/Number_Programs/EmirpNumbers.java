import java.util.Scanner;
class EmirpNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int rev =0;
		boolean flag=true;
		for (int i=2;i<=num ;i++ ){
				if (num%i==0) {
					flag=false;
					break;
				}
				else{
					while(num>0){
						rev = rev*10+(num%10);
						num /=10;
				   }
				
					for (int j=2;j<=rev ;j++) {
						if (num%j!=0) {
							flag=true;
							break;
						}	
					}
	
		}

	} 
	if(flag)
			System.out.println("the original num "+dup+ " and its emirp is "+rev);
		else
			System.out.println("This is not a prime number");
}
}
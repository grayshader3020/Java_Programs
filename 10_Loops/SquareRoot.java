import java.util.Scanner;
class SquareRoot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want squareroot of : ");
	    int num = sc.nextInt();
	    boolean flag = false;

	    for (int i=1;i<=num ;i++ ) {
	    	if (i*i==num) {
	    		flag = true;
	    		System.out.println(i +" is a perfect sqrt for "+ num);
	    	}
	    	if(i*i>num) //waste iteration 
	    		break;
	    }
	    if(!flag){
	    	System.out.println(num +" is not having a perfect sqrt ");
	    }
		
			
	}
}
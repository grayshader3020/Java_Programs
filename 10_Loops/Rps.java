import java.util.Scanner;
class Rps 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		int rNum = 0;
		for (; ; )
		{
			int num = (int)(Math.random()*10);
			if(num>=1&&num<=3){
				rNum=num;
				break;
			}
		}
		String codeOpt = null;
		if(rNum==1){
			codeOpt = "STONE";
		}
		else if(rNum==2){
			codeOpt = "PAPER";
		}
		else if(rNum==3){
			codeOpt = "SCISSOR";
		}
		else{
			System.out.println("Invalid Input.");
			return;
		}
		System.out.println();
		System.out.println("   Welcome");
		System.out.println("1.STONE 2.PAPER 3.SCISSOR");
		System.out.print("Enter the option: ");
		int opt = S.nextInt();
		String userOpt = null;
		if(opt==1){
			userOpt = "STONE";
		}
		else if(opt==2){
			userOpt = "PAPER";
		}
		else if(opt==3){
			userOpt = "SCISSOR";
		}
		else{
			System.out.println("Invalid Input.");
			return;
		}
		System.out.println("User Input : "+userOpt+" BOT Input : "+codeOpt);
		if((opt==1&&rNum==3)||(opt==2&&rNum==1)||(opt==3&&rNum==2))
		{
			System.out.println("User Wins.");
		}
		if((opt==1&&rNum==2)||(opt==2&&rNum==3)||(opt==3&&rNum==1))
		{
			System.out.println("BOT Wins.");
		}
		else
		{
			System.out.println("DRAW.");
		}
	}
}

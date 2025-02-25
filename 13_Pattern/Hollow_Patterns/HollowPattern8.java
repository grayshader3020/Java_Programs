/*
		o/p:
		          *
		        *   *
		      *       *
		    *           *
		  *               *
		*   *   *   *   *   *
		
		
*/


class HollowPattern8{
	public static void main(String[] args) {
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j==4 || i==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			for(int j=1;j<=i;j++)
			{
				if(i==j || i==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}  
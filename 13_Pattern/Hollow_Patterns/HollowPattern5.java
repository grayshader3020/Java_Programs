/*
		o/p:

		*
		* *
		*   *
		*     *
		*       *
		*     *
		*   *
		* *
		*
			
		*/


class HollowPattern5{
	public static void main(String[] args) {
		for(int i = 0 ;i <5 ; i++)
			{
				for(int j=0;j<=i;j++)
				{
					if(j==0 ||  i==j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			for(int i = 1 ;i <5 ; i++)
			{
				for(int j=2;j<=5;j++)
				{
					if( j==2 ||i+j==6)
					{
						System.out.print("* ");
					}
					else
					{ 
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	}
}


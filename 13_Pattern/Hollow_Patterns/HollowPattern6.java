 /*

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

class HollowPattern6{
	public static void main(String[] args) {
		for(int i = 0 ;i <4 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==4 ||  i+j==4)
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
		for(int i = 0 ;i <5 ; i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==5  || i==j || j==4)
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
	
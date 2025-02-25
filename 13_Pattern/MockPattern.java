/*
1*2*3*4*5*4*3*2*1
1*2*3*4*3*2*1
1*2*3*2*1
1*2*1 */


class MockPattern{
	public static void main(String[] args) 
	{
		int rows = 5;
		for (int i=rows;i>=1;i-- ) 
		{
			//Ascending numbers
			for (int j=1;j<=i ;j++ )
		    {
				System.out.print(j+"*");
			}
			//Descending(excluding the peak)
			//       4-1=3  
			for (int j=i-1;j>=1;j--) 
			{
				System.out.print(j);
				if (j>1)
			    {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
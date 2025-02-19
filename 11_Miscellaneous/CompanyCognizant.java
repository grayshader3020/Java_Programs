/*Example:
Input:
Enter Name :  
aabb cc

Characters: a, a, b, b, , c, c
Frequencies:
a: 2
b: 2
c: 2
Spaces (spaceCount): 1
Maximum frequency (max): 2
Calculation:

name.length() = 7 (including space)
max + spaceCount = 2 + 1 = 3
Result = 7 - 3 = 4
Output:
4
*/


import java.util.Scanner;
class CompanyCognizant
{
	public static void main(String[] args) 
	{
		int arr[] = new int[127];
		int max = 0 ;
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		int spaceCount = 0 ;
		for(int i=0;i<name.length();i++)
		{	
			if(name.charAt(i)==' ')
				spaceCount++;
			arr[name.charAt(i)]++;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				if(arr[i]>max)
					max=arr[i];
			}			
		}
		System.out.println(name.length()-(max+spaceCount));
	}
}
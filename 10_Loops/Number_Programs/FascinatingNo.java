class FascinatingNo{
	public static void main(String[] args) {
		int num =327;
		String str = num+""+(num*2)+(num*3);
		boolean flag=true;
		// loop which starts from 1 to 9 characters
		for (char i='1';i<='9';i++ ) {
			int cnt =0;// inti char count is equals to zero for every new character
			//fetch char from string one by one from 0 index
			for (int  j=0;j<str.length();j++ ) {
				char ch = str.charAt(j); // char fetched is stored in var ch
				if(ch==i)  // if  i char matches with ch char if executes
					ch++; // increment the count if cnd satisfy
			}
			if (cnt!=1) // if cnt of char is not equals to 1 then if executes
			{
			  flag=true;  // re inti the flag is cnt is not equals to 1
			  break; //terminate the loop
			}

		}
		if (flag)
		{
				System.out.println(num +" is a fascinating number");	
		}
		else
		{
				System.out.println(num +" is  not a fascinating number");
		}
	}
}
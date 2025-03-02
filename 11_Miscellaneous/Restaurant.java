import java.util.*;
class Restaurant
{
	static String name; //null
	static long  contact; //0
	static String address;//null
	static ArrayList<String> basket = new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		 {
		 	System.out.println();
		 	System.out.println("           SILVERLINE PLATTER");
		 	System.out.println();
		 	System.out.println("1. Create Account");
		 	System.out.println("2. Existing User");
		 	System.out.println();
		 	System.out.println("Enter an option : ");
		 	int opt = sc.nextInt();
		 	System.out.println();
		 	switch(opt)
		 	{
		 		case 1 : createAccount(sc);break;
		 		case 2 : login(sc); break;
		 	    default : System.out.println("INVALID INPUT");
		 	    	break;
		 	}
		 }	
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("     REGISTRATION");
		System.out.println();
		System.out.println("Name  : ");
		name = sc.next();
		System.out.println("Phone  :");
		contact = sc.nextLong();
		System.out.println("Address  : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
	}
	public static void login(Scanner sc)
	{
		if(name==null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return ;  //calling method(main)
		}

		System.out.println("        LOGIN");
		System.out.println();

		for (int attempt=3;attempt>=1;attempt-- ) 
		{
			System.out.println("Username : ");
			String username = sc.next();
			System.out.println("Password : ");
			long phone = sc.nextLong();
			if (name.equals(username) && contact==phone)
		    { 
		    	homepage(sc);
			}
			else
			{
				System.out.println("INVALID CRED");
				System.out.println("ATTEMPT LEFT : "+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK U & NEVER VISIT AGAIN ");
		System.exit(0); //terminate  the exec
	}
	public static void homepage(Scanner sc)
	{
		for (; ; ) {
			System.out.println("     HOME PAGE  ");
			System.out.println();
			System.out.println("1. Menu");
			System.out.println("2. Order");
			System.out.println("3. Table Booking");
			System.out.println("4. Logout ");
			System.out.println();
			System.out.println("Enter an option : ");
			int opt1 = sc.nextInt();
			switch(opt1)
			{
				case 1 : menu(sc);break;
				case 2 : order(sc);break;
				//case 3 :tablebooking();break;
				case 4 : System.out.println("THANK YOU & VISIT AGAIN");
						 System.exit(0);break;
				default :  System.out.println("INVAILID  INPUT ");break;
			}
		}
			
	}

	public static void menu(Scanner sc)
	{
		for (; ; ) {
			System.out.println();
			System.out.println("        MENU        ");
			System.out.println();
			System.out.println("        VEG        ");
			System.out.println();
			System.out.println("101 : Panner_Masala 450/-");
			System.out.println("102 : Shev_bhaji 80/-");
			System.out.println("103 : Panner_tikka_Masala 550/-");
			System.out.println("104 : Kaju_Masala 350/-");
			System.out.println("105 : Veg_Pullav 450/-");
			System.out.println();
			System.out.println("        Non-VEG        ");
			System.out.println();
			System.out.println("106 : Mutton_Birayani 350/-");
			System.out.println("107 : Chicken_Birayani 180/-");
			System.out.println("108 : Chicken_Handi 550/-");
			System.out.println("109 : Mutton_Handi 750/-");
			System.out.println("110 : Butter_Chicken 450/-");
			System.out.println();
			System.out.println("        Roti        ");
			System.out.println();
			System.out.println("111 : Roti 15/-");
			System.out.println("112 : Nan 25/-");
			System.out.println("113 : Butter_Roti 20/-");
			System.out.println("114 : Butter_Nan 30/-");
			System.out.println();
			System.out.println("115 :  Exit Menu ");
			System.out.println();
			System.out.println("Enter the food id : ");
			int id = sc.nextInt();
			switch(id)
			{
				case 101:{
					basket.add("101 : Panner_Masala 450");
					System.out.println("Panner Masala added inside bucket");
					break;
				}
				case 102:{
					basket.add("102 : Shev_bhaji 80");
					System.out.println("Shev bhaji added inside bucket");
					break;
				}
				case 103:{
					basket.add("103 : Panner_tikka_Masala 550");
					System.out.println("Panner tikka Masala added inside bucket");
					break;
				}
				case 104:{
					basket.add("104 : Kaju_Masala 350");
					System.out.println("kaju Masala added inside bucket");
					break;
				}
				case 105:{
					basket.add("105 : Veg_Pullav 450");
					System.out.println("Veg Pullav added inside bucket");
					break;
				}
				case 106:{
					basket.add("106 : Mutton_Birayani 350");
					System.out.println("Mutton Birayani added inside bucket");
					break;
				}
				case 107:{
					basket.add("107 : Chicken_Birayani 180");
					System.out.println("Chicken Birayani added inside bucket");
					break;
				}
				case 108:{
					basket.add("108 : Chicken_Handi 550");
					System.out.println("Chicken Handi added inside bucket");
					break;
				}
				case 109:{
					basket.add("109 : Mutton_Handi 750");
					System.out.println("Mutton Handi added inside bucket");
					break;
				}
				case 110:{
					basket.add("110 : Butter_Chicken 450");
					System.out.println("Butter Chicken added inside bucket");
					break;
				}
				case 111:{
					basket.add("111 : Roti 15");
					System.out.println("Roti added inside bucket");
					break;
				}
				case 112:{
					basket.add("112 : Nan 25");
					System.out.println("Nan added inside bucket");
					break;
				}
				case 113:{
					basket.add("113 : Butter_Roti 20");
					System.out.println("Butter Roti added inside bucket");
					break;
				}
				case 114:{
					basket.add("114 : Butter_Nan 30");
					System.out.println("Butter Nan added inside bucket");
					break;
				}

				case 115:{
					return;
				}
				default:{
					System.out.println("Invalid Food Id ");
					break;
				} 

			}

		}
	}
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println("        ORDERS          ");
		System.out.println();
		if (basket.size()==0)
	    {
			System.out.println("Basket is Empty Add Food Items ");	
		}
		for (String foodItem : basket )
	    {
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food item");
		System.out.println("3. Proceed to payment");
		System.out.println();
		System.out.println("Enter an option : ");
        int opt1 = sc.nextInt(); 
		switch(opt1)
		{
			case 1 : {
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}
			case 2 : {
				System.out.println("Enter foodId");
				int foodId = sc.nextInt();
				removefoodId(foodId);
				break;
			}
			case 3 :{
				billGenerate();
				break;
			}
		}
	}
	public static void removefoodId(int foodId)
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int indx =0;
		boolean flag = false;
		for (String foodItem : dupBasket )
	    {
			String [] arr = foodItem.split(" ");
			if (arr[0].equals(foodId+"")) 
			{
				dupBasket.remove(indx);
				flag = true;
				System.out.println("Food Item Removed ");
			}
			indx++;
		}
		if (!flag) {
			System.out.println("Food item doesnt Exist");
		}
		basket = dupBasket;

	}
	public static void billGenerate()
	{
		double totalBill = 0;
		for(String foodItem : basket)
		{
			String [] arr = foodItem.split(" ");
			totalBill += Double.parseDouble(arr[3]);
		}
		System.out.println("Total Bill : "+totalBill+" rs. ");
	}
}

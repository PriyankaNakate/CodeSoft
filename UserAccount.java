import java.util.*;
class UserAccount
{
	static String name;
	static String address;
	static long mobileNo;
	static double balance;
	static int pin;
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	for(; ;)
	 	{
	 		System.out.println();
	 		System.out.println("***Welcome to Bank***");
	 		System.out.println("1.Create New Account");
	 		System.out.println("2.Existing User");
	 		System.out.print("Enter option : ");
	 		int op = sc.nextInt();
	 		switch(op)
	 		{
	 			case 1 : {
	 				System.out.println();
	 				System.out.println("***Create Account Module***");
	 				sc.nextLine();
	 				System.out.print("Enter a name : ");
	 				name = sc.nextLine();
	 				System.out.print("Enter address : ");
	 				address = sc.nextLine();
	 				System.out.print("Enter mobile number : ");
	 				mobileNo = sc.nextLong();
	 				System.out.print("Enter deposite amount : ");
	 				balance = sc.nextDouble();
	 				System.out.print("Enter pin : ");
	 				pin = sc.nextInt();
	 				System.out.println("Account Created successfully");
	 				break;
	 			}

	 			case 2 :{
	 				for(; ;)
	 				{
	 					System.out.println();
	 					System.out.println("***Features***");
	 					System.out.println("1.Check balance");
	 					System.out.println("2.Deposte");
	 					System.out.println("3.Withdraw");
	 					System.out.println("4.LogOut");

	 					System.out.print("Enter option : ");
	 					int option = sc.nextInt();
	 					switch(option)
	 					{
	 						case 1 : {
	 							System.out.println("***Check balance***");
	 							System.out.println("Enter a pin : ");
	 							int enterPin = sc.nextInt();
	 							if(pin==enterPin)
	 								System.out.println("Account balance : "+balance);
	 							else
	 								System.out.println("You entered wrong pin");
	 							break;
	 						}

	 						case 2 : {
	 							System.out.println("***Deposite Amount***");
	 							System.out.println("Enter amount : ");
	 							double depoAmount = sc.nextDouble();
	 							balance+=depoAmount;
	 							System.out.println("Creadited "+depoAmount+" rs suceessfully");
	 							break;
	 						}

	 						case 3 : {
	 							System.out.println("***Withdraw Amount***");
	 							System.out.println("Enter amount : ");
	 							double withdrawAmount = sc.nextDouble();
	 							if(withdrawAmount<=balance)
	 							{
	 								System.out.println("Enter pin : ");
	 								int enterPin = sc.nextInt();
	 								if(pin==enterPin)
	 								{
	 									balance-=withdrawAmount;
	 									System.out.println("Debited "+withdrawAmount+" rs from your account");
	 								}
	 								else
	 									System.out.println("You entered wrong pin");
	 							}
	 							else
	 								System.out.println("Insufficient fund");
	 							break;
	 						}

	 						case 4 : {
	 							System.out.println("***LogOut successfully***");
	 							System.exit(0);
	 						}

	 						default : System.out.println("Invalid option");
	 							break;
	 					}
	 					break;
	 				}
	 			}
	 		}	
	 	}
	} 
}

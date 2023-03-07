import java.util.Scanner;
public class ATM_Project {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String userName,password;
		int right = 3,select;
		double balance=10000,amount;
		while(right>0) {
			System.out.print(" Enter your username ");
			userName = input.nextLine();
		
			System.out.print(" Enter your password");
			password  =input.nextLine();
			
			if(userName.equals("admin") && password.equals("123")) {
				System.out.print("Hello, Welcome to XX Bank Mobile Application!");
				do {
					System.out.println("1-Deposit money into my account\n" +
									   "2-Withdraw money from my accounte\n" +
									   "3-Balance Inquiry\n" +
									   "4-Exit");
					
					System.out.print("Please select the action you want to do ");
					select = input.nextInt();
					
					switch(select) {
					case 1:
						System.out.print("Enter the amount you want to deposit");
						amount = input.nextInt();
						balance += amount;
					case 2:
						System.out.print("Enter the amount of money to withdraw from your account ");
						amount = input.nextInt();
						if(amount>balance) {
							System.out.print("Sorry, I can't process your transaction. You can't withdraw more than the money in your account."); 
						}
						else {
							balance -=amount;
							System.out.print("Your transaction is being processed...Amount left in your account ");
						}
					case 3:	
						System.out.println("Bakiyeniz " + balance);
					}
						
				}while(select !=4); {
					System.out.print("Logging out of the system. Have a nice day.");
					break;
				}
			}
			else {
				right--;
				System.out.print("Username and password are incorrect. Please try again.");
			
				if(right == 0) {
				System.out.print("Your account has been blocked because your password has expired. Please contact your bank.");
				}
				else {
				System.out.println("Your remaining entry " + right);
				}
			}
		}
		
	}
}

package atmSystem;

import java.util.Scanner;

public class BankAppSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount accOne = new BankAccount("User1", "x12hd2");
		accOne.selectOption();
		
	}
	
}
class BankAccount{
	int balance;
	int listOfTransactions;
	String userName;
	String userID;
	
	BankAccount(String userName, String userID)
	{
		this.userName = userName;
		this.userID = userID;
	}
	
	void deposit(int amount)
	{
		if(amount != 0) 
		{
			this.balance = balance + amount;
			this.listOfTransactions = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			this.balance = balance - amount; 
			this.listOfTransactions = amount;
		}
	}
	
	void getListofTransact()
	{
		if(listOfTransactions > 0)
		{
			System.out.println("Balance: " + listOfTransactions);
		}
		else if (listOfTransactions < 0)
		{
			//https://www.tutorialspoint.com/java/number_abs.htm
			System.out.println("Balance: " + Math.abs(listOfTransactions));
		}
		else 
		{
			System.out.println("No Transactions");
		}
	}
	
	void selectOption() 
	{
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Bank of Ontario " + userName);
		System.out.println("Your Account Number: " + userID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. List of Transaction");
		System.out.println("EB. Exit");
		
		do 
		{
			System.out.println("Please enter an option");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case'A':
				System.out.println("-------------------------");
				System.out.println("Balance: " + balance );
				System.out.println("-------------------------");
				System.out.println("\n");
				break;
			
			case'B':
				System.out.println("-------------------------");
				System.out.println("Enter an amount to deposit: ");
				System.out.println("-------------------------");
				int amountAfterDesposit = scanner.nextInt();
				deposit(amountAfterDesposit);
				System.out.println("\n");
				break;
			
			case'C': 
				System.out.println("-------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("-------------------------");
				int amountAfterWithdraw = scanner.nextInt();
				withdraw(amountAfterWithdraw);
				System.out.println("\n");
				break;
				
			case'D':
				System.out.println("--------------------------");
				getListofTransact();
				System.out.println("--------------------------");
				System.out.println("\n");
				
			default:
				System.out.println("Invalid Option! Please try again");
				break;
				
			}
		}while(option != 'E');
		
		System.out.println("Thank you, come again!");
	}
		
}



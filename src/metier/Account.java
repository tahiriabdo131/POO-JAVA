package metier;

public class Account extends Object {
	
	//The Account Code
	private int code;
	//The Account Balance
	private double balance;
	
	private static int numberAccounts;
	
	
	//Constructor With Parameters
	public Account(double balance) {
		++numberAccounts;
		this.code = numberAccounts;
		this.balance = balance;
	}	
	
	//Constructor Without Parameters
	//public Account() {}

	
	//Method To GET The Account Code
	public int getCode() {
		return code;
	}


	//GET The Account Balance
	public double getBalance() {
		return balance;
	}

	//GET The Accounts Number
	public static int getNumberAccounts() {
		return numberAccounts;
	}
	
	//ToString Method
	@Override
	public String toString() {
		return "Account [code=" + code + ", balance=" + balance + ", NumberAccounts ="+ numberAccounts +"]";
	}	
	
	
	//Add Amount To Account
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	//Withdraw Amount From Account
	public void withdraw(double amount) {
		if(this.balance > amount) {
			this.balance -= amount;
		}
	}
	
	//Static Method
	public static void staticMethod() {System.out.println("the method static work");}
}

package metier;

public class Application {
	static int a = 2;
	public static void main(String[] args) {
		Account account = new Account(500.2);
		account.withdraw(50);
		Account account2 = new Account(600.2);
		System.out.println(account.toString());
		System.out.println(account2.toString());
		System.out.println("Accounts Number = "+Account.getNumberAccounts());
		
		Account.staticMethod();
	}

}

package bankaccountpackage;

/**
	   A bank account has a balance that can be changed by 
	   deposits and withdrawals.
 */
public class BankAccount
{  
	/**
	 * 'balance' is the instance variable for the BankAccount class
	 * 'private' because we only want it to be updated with  the 'methods' below
	 * Each time a new instance of BankAccount is created, new instance variables are created for the new object
	 */
	private double balance;

	/**
	      Constructs a bank account with a zero balance. A constructor is a type of 'method' this code is used when an new object,
	      is created(instantiated). Note that the constructors have the same name as the class 'BankAccount'
	 */
	public BankAccount()
	{   
		balance = 0;
	}

	/**
	      Constructs a bank account with a given balance.
	      'initialBalance' is a parameter sent by BankAccountTester and is used to initialize the balance for the new account
	      Parameter variables like 'initialBalance' are called local variables and cease to exist one the method code ends. 
	      @param initialBalance the initial balance
	 */
	public BankAccount(double initialBalance)
	{   
		balance = initialBalance;
	}

	/**
	      Deposits money into the bank account.
	      'public' means that the method is part of the public interface for the BankAccount class and can be called from outside
	      'void' means that no data is returned
	      'deposit' is the name of the method
	      This method changes the value of the instance variable 'balance' so it is called a 'mutator' or 'setter'
	      @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{  
		balance = balance + amount;
	}

	/**
	      Withdraws money from the bank account.
	      Any amount of code can go inside a method
	      For example if we wanted to check to see if 'balance' was too low to support the withdrawal amount,
	      we could stop the withdrawal
	      @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{   
		if(amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Error: Withdrawl exceeds account balance, cannot complete transaction.");
			balance = balance;
		}

	}

	/**
	      Gets the current balance of the bank account.
	      Notice there is no 'void' because the getBalance method returns the balance
	      However, since it is returning balance 'double' is indicated after public
	      A method that returns data is called an 'accessor' or 'getter'.
	      'getBalance' is a getter
	      @return the current balance
	 */
	public double getBalance()
	{   
		return balance;
	}
}


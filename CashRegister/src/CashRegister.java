public class CashRegister {


	//create and initialize local variables
	private double purchase;
	private double payment;

	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}

	public void recordPurchase(double amount) 
	{
		purchase = purchase + amount;

	}
	public void receivePayment(double moneyGiven)
	{
		payment = payment + moneyGiven;
	}
	public double giveChange()
	{

		return (payment - purchase);

	}
	public void printChange() {
		System.out.printf("Your change is: %.2f", giveChange());


	}

}




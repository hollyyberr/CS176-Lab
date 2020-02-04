package cashregisterV2;
import java.text.NumberFormat;

public class CashRegisterV2 {


	//create and initialize local variables
	private double purchase;
	private double payment;
	double discount;
	double moneyOff;
	double newAmount;
	NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public CashRegisterV2()
	{
		purchase = 0;
		payment = 0;
	}

	public void recordPurchase(double amount) 
	{
		purchase = purchase + amount;

	}
	public void calcDiscount (final double THRESHOLD, final double DISCOUNT) {
		if(purchase >= THRESHOLD) {
			moneyOff = DISCOUNT * purchase;
			newAmount = purchase - moneyOff;
			System.out.println("Your total purchases were " + formatter.format(purchase) + " and because you spent over " + formatter.format(THRESHOLD) + " , you are entitled to a " + (DISCOUNT * 100) + "% " + " discount of " + formatter.format(moneyOff) + " reducing your balance to " + formatter.format(newAmount));
		}
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
		System.out.print("Your change is: " + formatter.format((giveChange())));


	}




}



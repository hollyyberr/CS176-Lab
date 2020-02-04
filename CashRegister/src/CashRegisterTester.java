
import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {

		//connect cash register to tester
		CashRegister register = new CashRegister();

		//declare and initialize local variables
		final double SENTINEL = -1;

		//declare the scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a purchase amount or - 1 to stop: ");

		//while loop for reading in purchases and payments
		while(scan.hasNextDouble()) {
			double costPurchase = scan.nextDouble();
			if(costPurchase == SENTINEL) {
				break;
			}
			System.out.print("Enter a purchase amount or - 1 to stop: ");
			register.recordPurchase(costPurchase);
		}
		System.out.print("Enter a payment amount: ");
		double amountPaid = scan.nextDouble();
		register.receivePayment(amountPaid);
		register.giveChange();
		register.printChange();




	}


}



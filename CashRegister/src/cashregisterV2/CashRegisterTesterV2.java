package cashregisterV2;

import java.util.Scanner;

public class CashRegisterTesterV2 {

	public static void main(String[] args) {

		//connect cash register to tester
		CashRegisterV2 register = new CashRegisterV2();

		//declare and initialize local variables
		final double SENTINEL = -1;
		final double DISCOUNT = .10;
		final double THRESHOLD = 50;

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
		register.calcDiscount(THRESHOLD, DISCOUNT);
		System.out.print("Enter a payment amount: ");
		double amountPaid = scan.nextDouble();
		register.receivePayment(amountPaid);
		register.giveChange();
		register.printChange();




	}


}



package nestedclass;

import java.util.Scanner;

public class TakePayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("We have credit card, debitcard,paypall and bitcoin option avialble");
		System.out.println("Please tell me how do you like to pay: ");
		String paymentMethod = sc.nextLine();
		PaymentGateway paymentGateway = new PaymentGateway();
		paymentGateway.processPayment(paymentMethod);
		sc.close();

	}

}

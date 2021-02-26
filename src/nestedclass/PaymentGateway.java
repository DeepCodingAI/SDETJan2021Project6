package nestedclass;

public class PaymentGateway {
	PayByCreditCard credit = new PayByCreditCard();
	
	public void processPayment(String paymentMethod) {
		System.out.println("processing payment.....wait untill complete");
		if(paymentMethod.equalsIgnoreCase("creditCard")){
			credit.payWithCreditCard();
		}else if(paymentMethod.equalsIgnoreCase("debitCard")){
			PayByDebitCard.payWithDebitCard();
		}else if(paymentMethod.equalsIgnoreCase("paypall")){
			PayByPayPall.payWithPaypall();
		}else if(paymentMethod.equalsIgnoreCase("bitcoin")){
			PayByBitcoin.payWithBitcoin();
		}
	}
	
	
	private class PayByCreditCard{
		private void payWithCreditCard() {
			System.out.println("Making payment with credit card");
		}
	}
	
	private static class PayByDebitCard{
		private static void payWithDebitCard() {
			System.out.println("Making payment with Debit card");
		}
	}
	
	private static class PayByPayPall{
		private static void payWithPaypall() {
			System.out.println("Making payment with paypal card");
		}
	}
	
	private static class PayByBitcoin{
		private static void payWithBitcoin() {
			System.out.println("Making payment with Bitcoin");
		}
	}

}

public abstract class PaymentProcessor {
	public abstract void processPayment(double amount);

	public void processPayment(double amount, String couponCode) {
		double discountedAmount = amount;

		if (couponCode != null && !couponCode.trim().isEmpty()) {
			discountedAmount = amount * 0.90;
		}

		processPayment(discountedAmount);
	}
}

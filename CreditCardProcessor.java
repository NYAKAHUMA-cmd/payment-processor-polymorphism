// Subclass - overrides processPayment
public class CreditCardProcessor extends PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card: Processing payment of $" + amount + " via Credit Card.");
    }

    @Override
    public void processPayment(double amount, String couponCode) {
        double discount = amount * 0.10; // 10% off for Credit Card promo
        double finalAmount = amount - discount;
        System.out.println("Credit Card: Processing payment of $" + finalAmount 
            + " via Credit Card (Coupon '" + couponCode + "' applied, saved $" + discount + ").");
    }
}